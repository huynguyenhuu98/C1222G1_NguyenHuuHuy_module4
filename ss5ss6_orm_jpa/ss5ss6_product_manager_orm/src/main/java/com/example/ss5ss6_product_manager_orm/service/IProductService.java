package com.example.ss5ss6_product_manager_orm.service;

import com.example.ss5ss6_product_manager_orm.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void delete(int id);
    List<Product> findByName(String name);
}
