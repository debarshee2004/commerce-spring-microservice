package com.debarshee.ecommerce.service;

import com.debarshee.ecommerce.model.Customer;
import com.debarshee.ecommerce.records.CustomerRequest;
import com.debarshee.ecommerce.records.CustomerResponse;
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

    public CustomerResponse fromCustomer(Customer customer) {
        if (customer == null) {
            return null;
        }
        return new CustomerResponse(
                customer.getId(),
                customer.getUsername(),
                customer.getEmail(),
                customer.getFirstname(),
                customer.getLastname(),
                customer.getAddress()
        );
    }
}
