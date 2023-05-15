package com.example.ss3_product_manager.controller;

import com.example.ss3_product_manager.model.Product;
import com.example.ss3_product_manager.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping()
    public String display(Model model) {
        model.addAttribute("product",iProductService.getAll());
        return "/list";
    }
    @GetMapping("/create-form")
    public String createForm(Model model) {
        model.addAttribute("product",new Product());
        return "/create";
    }
    @GetMapping("/{id}/detail")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "detail";
    }
    @PostMapping
    public String create(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("mess", "Add successful!");
        return "redirect:/product";
    }
    @GetMapping("/{id}/update")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        iProductService.update(product.getId(), product);
        redirectAttributes.addFlashAttribute("mess", "Update successful!");
        return "redirect:/product";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int idDelete, RedirectAttributes redirectAttributes) {
        iProductService.delete(idDelete);
        redirectAttributes.addFlashAttribute("mess", "Delete successful!");
        return "redirect:/product";
    }

    @GetMapping("/search")
    public String listSearch(@PathVariable String name, Model model) {
        model.addAttribute("product", iProductService.findByName(name));
        return "redirect:/product";
    }
}
