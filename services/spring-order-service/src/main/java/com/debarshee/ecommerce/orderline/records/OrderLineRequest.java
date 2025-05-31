package com.debarshee.ecommerce.orderline.records;

public record OrderLineRequest(
        Integer id,
        Integer orderId,
        Integer productId,
        double quantity
) {}
