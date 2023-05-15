package com.example.ss7_spring_data_boot.service.impl;

import com.example.ss7_spring_data_boot.model.Category;
import com.example.ss7_spring_data_boot.repository.ICategoryRepository;
import com.example.ss7_spring_data_boot.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findCategory() {
        return iCategoryRepository.findAll();
    }
}
