package com.debarshee.ecommerce.notification.model;

import com.debarshee.ecommerce.kafka.order.OrderConfirmation;
import com.debarshee.ecommerce.kafka.paymeny.PaymentConfirmation;
import com.debarshee.ecommerce.notification.model.enums.NotificationType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
public class Notification {

    @Id
    private String id;
    private NotificationType type;
    private LocalDateTime notificationDate;
    private OrderConfirmation orderConfirmation;
    private PaymentConfirmation paymentConfirmation;
}