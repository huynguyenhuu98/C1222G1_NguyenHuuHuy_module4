package com.example.ss9_app_book.service;

import com.example.ss9_app_book.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> display();
    Book findById(int id);
    Book save(Book book);
}
