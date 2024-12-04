package com.debarshee.ecommerce.customer;

public record CustomerResponse(
        String id,
        String username,
        String email,
        String firstname,
        String lastname
) {}
