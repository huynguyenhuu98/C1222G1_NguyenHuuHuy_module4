package com.example.ss9_app_book.controller;

import com.example.ss9_app_book.exception.ExceptionErrorBorrow;
import com.example.ss9_app_book.model.Book;
import com.example.ss9_app_book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("books", this.iBookService.display());
        return ("/list");
    }
    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable int id, Model model) {
        model.addAttribute("detail_book",this.iBookService.findById(id));
        return ("/detail");
    }

    @GetMapping("/borrow")
    public String borrowBook(@RequestParam (value = "idBook") int id) throws ExceptionErrorBorrow {
        Book book = iBookService.findById(id);
        if(book.getCount() == 0) {
            throw new ExceptionErrorBorrow();
        } else {
            int newCount = book.getCount() - 1;
            book.setCount(newCount);
            iBookService.save(book);
            return "redirect:/books";
        }
    }
    @ExceptionHandler(value = ExceptionErrorBorrow.class)
    public String handleException() {
        return "/errorBorrow";
    }
}
