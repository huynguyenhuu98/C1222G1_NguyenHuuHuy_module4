package com.example.ss7_spring_data_boot.service;

import com.example.ss7_spring_data_boot.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> getAll();
    Blog findById(int id);
    List<Blog> findByName(String name);
}
