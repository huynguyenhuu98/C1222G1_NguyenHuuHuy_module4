package com.example.ss7_spring_data_boot.controller;

import com.example.ss7_spring_data_boot.model.Blog;
import com.example.ss7_spring_data_boot.model.Category;
import com.example.ss7_spring_data_boot.service.IBlogService;
import com.example.ss7_spring_data_boot.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping
    public ResponseEntity<List<Blog>> getBlogs() {
        return new ResponseEntity<>(this.iBlogService.getAll(), HttpStatus.OK);
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
