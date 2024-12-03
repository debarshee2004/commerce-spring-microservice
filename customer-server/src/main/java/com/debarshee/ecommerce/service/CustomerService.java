package com.debarshee.ecommerce.service;

import com.debarshee.ecommerce.exception.CustomerNotFoundException;
import com.debarshee.ecommerce.model.Customer;
import com.debarshee.ecommerce.records.CustomerRequest;
import com.debarshee.ecommerce.records.CustomerResponse;
import com.debarshee.ecommerce.repository.CustomerRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;

@RequiredArgsConstructor
@Service
public class CustomerService {

    public final CustomerRepository repository;
    public final CustomerMapper mapper;

    public String createCustomer(@Valid CustomerRequest request) {
        var customer = repository.save(mapper.toCustomer(request));
        return customer.getId();
    }

    public void updateCustomer(@Valid CustomerRequest request) {
        var customer = repository.findById(request.id())
                .orElseThrow(() -> new CustomerNotFoundException(
                        format("Cannot update Customer :: No Customer found with the provided Id :: %s", request.id())
                ));
        mergerCustomer(customer, request);
        repository.save(customer);
    }

    private void mergerCustomer(Customer customer, @Valid CustomerRequest request) {
        if (StringUtils.isNotBlank(request.firstname())) {
            customer.setFirstname(request.firstname());
        }

        if (StringUtils.isNotBlank(request.lastname())) {
            customer.setFirstname(request.lastname());
        }

        if(request.address() != null) {
            customer.setAddress(request.address());
        }
    }

    public List<CustomerResponse> getAllCustomers() {
        return  this.repository.findAll()
                .stream()
                .map(this.mapper::fromCustomer)
                .collect(Collectors.toList());
    }
}

