package com.example.ss9_app_book.service.impl;

import com.example.ss9_app_book.model.Borrow;
import com.example.ss9_app_book.repository.IBorrowRepository;
import com.example.ss9_app_book.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowService implements IBorrowService {
    @Autowired
    private IBorrowRepository iBorrowRepository;
    @Override
    public List<Borrow> display() {
        return this.iBorrowRepository.findAll();
    }

    @Override
    public Borrow findById(int idBorrow) {
        return this.iBorrowRepository.findById(idBorrow).get();
    }

    @Override
    public Borrow save(Borrow borrow) {
        return this.iBorrowRepository.save(borrow);
    }
}
