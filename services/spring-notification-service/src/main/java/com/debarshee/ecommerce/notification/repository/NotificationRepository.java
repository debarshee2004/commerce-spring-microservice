package com.debarshee.ecommerce.notification.repository;

import com.debarshee.ecommerce.notification.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
}
