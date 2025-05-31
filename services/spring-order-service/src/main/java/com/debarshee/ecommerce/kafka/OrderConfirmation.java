package com.debarshee.ecommerce.kafka;

import com.debarshee.ecommerce.customer.CustomerResponse;
import com.debarshee.ecommerce.order.model.enums.PaymentMethod;
import com.debarshee.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {}
