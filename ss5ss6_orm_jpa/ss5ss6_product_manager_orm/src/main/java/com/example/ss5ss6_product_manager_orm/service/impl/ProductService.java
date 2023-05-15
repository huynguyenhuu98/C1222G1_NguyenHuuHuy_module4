package com.example.ss5ss6_product_manager_orm.service.impl;

import com.example.ss5ss6_product_manager_orm.model.Product;
import com.example.ss5ss6_product_manager_orm.repository.IProductRepository;
import com.example.ss5ss6_product_manager_orm.service.IProductService;
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
