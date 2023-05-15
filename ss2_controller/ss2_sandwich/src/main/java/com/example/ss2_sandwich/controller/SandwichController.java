package com.example.ss2_sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {
    @GetMapping("/list")
    public String index() {
        return "/list";
    }

    @RequestMapping("/save")
    public ModelAndView result(@RequestParam(value = "condiment", defaultValue = "") String[] arr) {
        ModelAndView modelAndView = new ModelAndView("list");
        if (arr.length == 0) {
            modelAndView.addObject("condiment", "No choice yet!");
        } else {
            modelAndView.addObject("condiment", arr);
        }
        return modelAndView;
    }
}
