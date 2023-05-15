package com.example.ss7_spring_data_boot.repository;

import com.example.ss7_spring_data_boot.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
