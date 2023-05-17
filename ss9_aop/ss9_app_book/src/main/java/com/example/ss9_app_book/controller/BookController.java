package com.example.ss9_app_book.controller;

import com.example.ss9_app_book.exception.ExceptionErrorBorrow;
import com.example.ss9_app_book.exception.ExceptionErrorPay;
import com.example.ss9_app_book.model.Book;
import com.example.ss9_app_book.model.Borrow;
import com.example.ss9_app_book.service.IBookService;
import com.example.ss9_app_book.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService iBookService;
    @Autowired
    private IBorrowService iBorrowService;

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("books", this.iBookService.display());
        model.addAttribute("borrows", new Borrow());
        return ("/list");
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable int id, Model model) {
        model.addAttribute("detail_book", this.iBookService.findById(id));
        return ("/detail");
    }

    @GetMapping("/borrow")
    public String borrowBook(@RequestParam(value = "idBook") int id) throws ExceptionErrorBorrow {
        Book book = iBookService.findById(id);
        if (book.getCount() == 0) {
            throw new ExceptionErrorBorrow();
        } else {
            int newCount = book.getCount() - 1;
            book.setCount(newCount);
            Borrow borrow = new Borrow();
            int code = (int) (Math.random() * (99999 - 10000) + 10000);
            borrow.setCode(code);
            long time = System.currentTimeMillis();
            borrow.setDate(new java.sql.Date(time));
            List<Borrow> orderList = book.getBorrow();
            orderList.add(borrow);
            book.setBorrow(orderList);
            iBorrowService.save(borrow);
            iBookService.save(book);
            return "redirect:/books";
        }
    }
    @ExceptionHandler(value = ExceptionErrorBorrow.class)
    public String handleException() {
        return "/errorBorrow";
    }
    @GetMapping("/{id}/pay")
    public String payForm(@PathVariable int id, Model model) {
        model.addAttribute("code", iBookService.findById(id));
        return "/checkCode";
    }

    @GetMapping("/pay")
    public String payBook(@RequestParam(value = "code") int code, @RequestParam(value = "id") int id) throws ExceptionErrorPay {
        List<Borrow> orderList = iBorrowService.display();
        Book book = iBookService.findById(id);
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getCode() == code) {
                book.setCount(book.getCount() + 1);
                iBookService.save(book);
                return "redirect:/books";
            }
        }
        throw new ExceptionErrorPay();
    }

    @ExceptionHandler(value = ExceptionErrorPay.class)
    public String handleException(Exception exception) {
        return "/errorBorrow";
    }
}
