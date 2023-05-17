package com.example.ss9_app_book.repository;

import com.example.ss9_app_book.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBorrowRepository extends JpaRepository <Borrow, Integer> {
}
