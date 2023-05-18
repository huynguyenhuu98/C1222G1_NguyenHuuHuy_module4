package com.example.ss7_spring_data_boot.service;

import com.example.ss7_spring_data_boot.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findCategory();
}
