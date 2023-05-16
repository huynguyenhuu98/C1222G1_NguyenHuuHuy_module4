package com.example.ss10_cart_product.service;

import com.example.ss10_cart_product.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);

}
