package com.TransTech.LalandSons.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TransTech.LalandSons.entity.Notification;
import com.TransTech.LalandSons.repository.NotificationRepository;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public Notification createNotification(Notification notification) {
        // Save the notification to the database
        return notificationRepository.save(notification);
    }

    public void sendNotification(Notification notification) {
        // Logic for sending the notification (e.g., via email)
        // Set the 'sent' flag to true once sent
        notification.setSent(true);
        notification.setTimestamp(new Date());
        // Implement the notification sending mechanism (e.g., using JavaMail API)
        // Example: sendEmail(notification);
        // Save the updated notification
        notificationRepository.save(notification);
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
    
	public Notification getNotificationById(Long id) {
        return notificationRepository.findById(id).orElse(null);
    }

	
}
