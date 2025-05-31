package com.debarshee.ecommerce.records;

import com.debarshee.ecommerce.model.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "Customer username is required")
        String username,
        @NotNull(message = "Customer Email is required")
        @Email(message = "Customer Email is not a valid email address")
        String email,
        @NotNull(message = "Customer firstname is required")
        String firstname,
        @NotNull(message = "Customer firstname is required")
        String lastname,
        Address address
) {}
