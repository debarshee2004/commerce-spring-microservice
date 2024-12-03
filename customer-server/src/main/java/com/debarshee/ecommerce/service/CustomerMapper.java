package com.debarshee.ecommerce.service;

import com.debarshee.ecommerce.model.Customer;
import com.debarshee.ecommerce.records.CustomerRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toCustomer(@Valid CustomerRequest request) {
        if (request == null) {
            return null;
        }
        return Customer.builder()
                .id(request.id())
                .username(request.username())
                .email(request.email())
                .firstname(request.firstname())
                .lastname(request.lastname())
                .address(request.address())
                .build();
    }
}
