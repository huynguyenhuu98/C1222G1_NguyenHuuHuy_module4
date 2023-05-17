package com.example.ss9_app_book.aspect;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAspect {
    private int visitorCount = 0;
    @AfterReturning(pointcut = "execution(* com.example.ss9_app_book.controller.BookController.*Book(..))")
    public void logChangeCountBook() {
        System.out.println("has error");
    }

    @AfterThrowing(value = "execution(* com.example.ss9_app_book.controller.BookController.*List(..))")
    public void logQuantityPerson() {
        visitorCount++;
        System.out.println("Total visitors: " + visitorCount);
    }
}
