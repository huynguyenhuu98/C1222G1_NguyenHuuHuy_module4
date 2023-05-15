package com.example.ss9_app_book.service.impl;

import com.example.ss9_app_book.model.Book;
import com.example.ss9_app_book.repository.IBookRepository;
import com.example.ss9_app_book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public List<Book> display() {
        return iBookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        return iBookRepository.findById(id).get();
    }

    @Override
    public Book save(Book book) {
        return iBookRepository.save(book);
    }
}
