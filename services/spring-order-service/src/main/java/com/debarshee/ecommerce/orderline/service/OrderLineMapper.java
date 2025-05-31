package com.debarshee.ecommerce.orderline.service;

import com.debarshee.ecommerce.order.model.Order;
import com.debarshee.ecommerce.orderline.model.OrderLine;
import com.debarshee.ecommerce.orderline.records.OrderLineRequest;
import com.debarshee.ecommerce.orderline.records.OrderLineResponse;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest request) {
        return OrderLine.builder()
                .id(request.orderId())
                .productId(request.productId())
                .order(
                        Order.builder()
                                .id(request.orderId())
                                .build()
                )
                .quantity(request.quantity())
                .build();
    }

    public OrderLineResponse toOrderLineResponse(OrderLine orderLine) {
        return new OrderLineResponse(
                orderLine.getId(),
                orderLine.getQuantity()
        );
    }
}
