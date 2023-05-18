package com.example.ss7_spring_data_boot.service.impl;

import com.example.ss7_spring_data_boot.model.Blog;
import com.example.ss7_spring_data_boot.repository.IBlogRepository;
import com.example.ss7_spring_data_boot.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> getAll() {
        return iBlogRepository.findAll();
    }
    @Override
    public Blog findById(int id) {
        return this.iBlogRepository.findById(id).get();
    }

    @Override
    public List<Blog> findByName(String name) {
        return this.iBlogRepository.findByName(name);
    }

    @Override
    public Page<Blog> getPage(Pageable pageable) {
        return this.iBlogRepository.findAll(pageable);
    }

}