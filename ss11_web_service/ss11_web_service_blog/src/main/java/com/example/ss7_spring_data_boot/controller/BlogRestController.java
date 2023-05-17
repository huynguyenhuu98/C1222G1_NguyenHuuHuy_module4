package com.example.ss7_spring_data_boot.controller;

import com.example.ss7_spring_data_boot.model.Blog;
import com.example.ss7_spring_data_boot.model.Category;
import com.example.ss7_spring_data_boot.service.IBlogService;
import com.example.ss7_spring_data_boot.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
public class BlogRestController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/blogs")
    public ResponseEntity<List<Blog>> getBlogs() {
        return new ResponseEntity<>(this.iBlogService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/category")
    public ResponseEntity<List<Category>> getCategory() {
        return new ResponseEntity<>(this.iCategoryService.findCategory(), HttpStatus.OK);
    }
    @GetMapping("/detail")
    public ResponseEntity<Blog> getDetail(@RequestParam(value = "id") int id){
        Blog blog = iBlogService.findById(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
    @GetMapping("/findListBlog/{name}")
    public ResponseEntity<List<Blog>> listBlog(@PathVariable String name){
        return new ResponseEntity<>(this.iBlogService.findByName(name), HttpStatus.OK);
    }
}
