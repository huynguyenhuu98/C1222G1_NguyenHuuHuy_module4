package com.example.ss9_app_book.service;

import com.example.ss9_app_book.model.Borrow;

import java.util.List;

public interface IBorrowService {
    List<Borrow> display();
    Borrow findById(int idBorrow);
    Borrow save(Borrow borrow);
}
