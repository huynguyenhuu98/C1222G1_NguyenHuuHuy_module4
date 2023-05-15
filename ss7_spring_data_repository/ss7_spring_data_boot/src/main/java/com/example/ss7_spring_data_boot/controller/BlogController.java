package com.example.ss7_spring_data_boot.controller;

import com.example.ss7_spring_data_boot.model.Blog;
import com.example.ss7_spring_data_boot.service.IBlogService;
import com.example.ss7_spring_data_boot.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping
    public String getHome(Model model,
                          @PageableDefault(size = 1) Pageable pageable) {
        model.addAttribute("blogList", this.iBlogService.getAll(pageable));
        return "/blogs/list";
    }

    @GetMapping("/create-form")
    public String createForm(Model model) {
        model.addAttribute("blogs", new Blog());
        model.addAttribute("category", this.iCategoryService.findCategory());
        return "/blogs/create";
    }

    @PostMapping
    public String create(Blog blog, RedirectAttributes redirectAttributes) {
        this.iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("mess", "Add successful!");
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/update")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("blogs", iBlogService.findById(id));
        model.addAttribute("categories", this.iCategoryService.findCategory());
        return "/blogs/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.update(blog);
        redirectAttributes.addFlashAttribute("mess", "Update successful!");
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/detail")
    public String detail(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        model.addAttribute("category",iCategoryService.findCategory());
        return "/blogs/detail";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int idDelete, RedirectAttributes redirectAttributes) {
        iBlogService.delete(idDelete);
        redirectAttributes.addFlashAttribute("mess", "Delete successful!");
        return "redirect:/blogs";
    }

    @GetMapping("/search")
    public String searchId(@RequestParam int id, Model model) {
        model.addAttribute("blogs", iBlogService.findById(id));
        return "/blogs/list";
    }

}
