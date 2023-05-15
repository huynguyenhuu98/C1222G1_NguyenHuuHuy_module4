package com.example.ss7_spring_data_boot.service;

import com.example.ss7_spring_data_boot.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> getAll(Pageable pageable);
    void save(Blog blog);

    void delete(int id);

    void update(Blog blog);

    Blog findById(int id);

}
