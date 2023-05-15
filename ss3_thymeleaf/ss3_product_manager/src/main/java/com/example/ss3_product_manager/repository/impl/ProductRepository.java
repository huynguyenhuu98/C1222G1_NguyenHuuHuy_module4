package com.example.ss3_product_manager.repository.impl;

import com.example.ss3_product_manager.model.Product;
import com.example.ss3_product_manager.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static final Map<Integer, Product> productList;
    static {
        productList = new HashMap<>();
        productList.put(1,new Product(1,"Cake","10000","delicious","Kinh Do"));
        productList.put(2,new Product(2,"Milk","15000","sweet","Vinamilk"));
        productList.put(3,new Product(3,"Beer","20000","drunk","Heineken"));
        productList.put(4,new Product(4,"Wine","50000","easy to drink","France"));
    }
    @Override
    public List<Product> getAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productList.put(id, product);
    }

    @Override
    public void delete(int id) {
        productList.remove(id);
    }
    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product : productList.values()) {
            if (product.getName().contains(name)) {
                products.add(product);
            }
        }
        return products;
    }
}
