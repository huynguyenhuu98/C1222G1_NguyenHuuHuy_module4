package com.example.ss7_spring_data_boot.repository;

import com.example.ss7_spring_data_boot.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
}
