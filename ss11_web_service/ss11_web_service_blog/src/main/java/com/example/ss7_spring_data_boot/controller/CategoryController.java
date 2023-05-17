package com.example.ss7_spring_data_boot.controller;

import com.example.ss7_spring_data_boot.model.Blog;
import com.example.ss7_spring_data_boot.model.Category;
import com.example.ss7_spring_data_boot.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;
    @GetMapping
    public ResponseEntity<List<Category>> getBlogs() {
        return new ResponseEntity<>(this.iCategoryService.findCategory(), HttpStatus.OK);
    }
}
