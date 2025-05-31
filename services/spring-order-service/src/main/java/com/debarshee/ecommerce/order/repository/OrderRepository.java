package com.debarshee.ecommerce.order.repository;

import com.debarshee.ecommerce.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
