package com.debarshee.ecommerce.records;

import com.debarshee.ecommerce.model.Address;

public record CustomerResponse(
        String id,
        String username,
        String email,
        String firstname,
        String lastname,
        Address address
) {
}
