package com.example.ss3_product_manager.service.impl;

import com.example.ss3_product_manager.model.Product;
import com.example.ss3_product_manager.repository.IProductRepository;
import com.example.ss3_product_manager.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> getAll() {
        return iProductRepository.getAll();
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        iProductRepository.update(id, product);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return iProductRepository.findByName(name);
    }
}
