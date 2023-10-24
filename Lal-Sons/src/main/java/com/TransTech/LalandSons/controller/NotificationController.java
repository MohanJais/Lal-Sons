package com.TransTech.LalandSons.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TransTech.LalandSons.entity.Notification;
import com.TransTech.LalandSons.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public Notification createNotification(@RequestBody Notification notification) {
        return notificationService.createNotification(notification);
    }

    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @GetMapping("/{id}")
    public Notification getNotification(@PathVariable Long id) {
        return notificationService.getNotificationById(id);
    }
    
    @PostMapping("/send/{id}")
    public void sendNotification(@PathVariable Long id) {
        Notification notification = notificationService.getNotificationById(id);
        if (notification != null && !notification.isSent()) {
            notificationService.sendNotification(notification);
        }
    }
}
