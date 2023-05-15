package com.example.ss7_spring_data_boot.service.impl;

import com.example.ss7_spring_data_boot.model.Blog;
import com.example.ss7_spring_data_boot.repository.IBlogRepository;
import com.example.ss7_spring_data_boot.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    public Page<Blog> getAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void delete(int id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id).get();
    }

}