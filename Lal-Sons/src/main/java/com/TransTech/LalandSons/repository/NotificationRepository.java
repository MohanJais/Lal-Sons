package com.TransTech.LalandSons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TransTech.LalandSons.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
