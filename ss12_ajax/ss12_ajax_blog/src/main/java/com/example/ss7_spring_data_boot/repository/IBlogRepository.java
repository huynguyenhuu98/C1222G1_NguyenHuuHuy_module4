package com.example.ss7_spring_data_boot.repository;

import com.example.ss7_spring_data_boot.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blogs join category on category.id = blogs.id where name_blog = ?",nativeQuery = true)
    List<Blog> findByName(String name);

}
