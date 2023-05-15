package com.example.ss9_app_book.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAspect {
    @AfterReturning(pointcut = "execution(* com.example.ss9_app_book.controller.BookController.*Book(..))")
    public void logChangeCountBook(){
        System.out.println("has error");;
    }
}
