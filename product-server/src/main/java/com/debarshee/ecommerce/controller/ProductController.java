package com.debarshee.ecommerce.controller;

import com.debarshee.ecommerce.records.ProductPurchaseRequest;
import com.debarshee.ecommerce.records.ProductPurchaseResponse;
import com.debarshee.ecommerce.records.ProductRequest;
import com.debarshee.ecommerce.records.ProductResponse;
import com.debarshee.ecommerce.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<Integer> createProduct(
            @RequestBody @Valid ProductRequest request
    ) {
        return ResponseEntity.ok(service.createProduct(request));
    }

    @PostMapping("/purchase")
    public ResponseEntity<List<ProductPurchaseResponse>> purchaseProducts(
            @RequestBody List<ProductPurchaseRequest> request
    ) {
        return ResponseEntity.ok(service.purchaseProducts(request));
    }

    @GetMapping("/{product-id}")
    public ResponseEntity<ProductResponse> getById(
            @PathVariable("product-id") Integer productId
    ) {
        return ResponseEntity.ok(service.getById(productId));
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    // TODO: Create Update and Delete CRUD Operations
}
