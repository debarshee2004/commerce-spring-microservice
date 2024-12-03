package com.debarshee.ecommerce.repository;

import com.debarshee.ecommerce.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {}
