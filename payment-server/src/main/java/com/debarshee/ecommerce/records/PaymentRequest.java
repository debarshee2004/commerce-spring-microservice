package com.debarshee.ecommerce.records;

import com.debarshee.ecommerce.model.enums.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest (
        Integer id,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        Customer customer
) {}
