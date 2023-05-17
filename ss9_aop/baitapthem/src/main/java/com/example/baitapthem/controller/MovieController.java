package com.example.baitapthem.controller;

import com.example.baitapthem.dto.MovieDTO;
import com.example.baitapthem.model.Movie;
import com.example.baitapthem.service.IMovieService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private IMovieService iMovieService;

    @GetMapping
    public String display(Model model) {
        model.addAttribute("movies", this.iMovieService.display());
        return ("/list");
    }

    @GetMapping("/create-form")
    public String createForm(Model model) {
        model.addAttribute("movies", new MovieDTO());
        return "/create";
    }
    @PostMapping("/create")
    public String createMovie(@Valid @ModelAttribute(name = "movies") MovieDTO movieDTO, RedirectAttributes redirectAttributes,
                              Model model, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("MovieDTO",movieDTO);
            return ("/create");
        }
        Movie movie = new Movie();
        BeanUtils.copyProperties(movieDTO,movie);
        this.iMovieService.save(movie);
        redirectAttributes.addAttribute("mess","Create successful!");
        return ("redirect:/movie");
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int idDelete, RedirectAttributes redirectAttributes) {
        iMovieService.delete(idDelete);
        redirectAttributes.addFlashAttribute("mess", "Delete successful!");
        return "redirect:/blogs";
    }
}
