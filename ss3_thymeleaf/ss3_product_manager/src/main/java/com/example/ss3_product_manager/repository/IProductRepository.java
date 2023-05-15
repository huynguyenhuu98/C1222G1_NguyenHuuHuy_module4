package com.example.ss3_product_manager.repository;

import com.example.ss3_product_manager.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void delete(int id);
    List<Product> findByName(String name);
}
