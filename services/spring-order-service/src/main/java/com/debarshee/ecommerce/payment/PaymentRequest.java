package com.debarshee.ecommerce.payment;

import com.debarshee.ecommerce.customer.CustomerResponse;
import com.debarshee.ecommerce.order.model.enums.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {}
