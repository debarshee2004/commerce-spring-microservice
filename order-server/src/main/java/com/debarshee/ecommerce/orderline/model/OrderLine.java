package com.debarshee.ecommerce.orderline.model;

import com.debarshee.ecommerce.order.model.Order;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "customer_line")
public class OrderLine {

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    private Integer productId;
    private double quantity;
}