package com.debarshee.ecommerce.service;

import com.debarshee.ecommerce.records.CustomerRequest;
import com.debarshee.ecommerce.repository.CustomerRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerService {

    public final CustomerRepository repository;
    public final CustomerMapper mapper;

    public String create(@Valid CustomerRequest request) {
        var customer = repository.save(mapper.toCustomer(request));
        return customer.getId();
    }
}

