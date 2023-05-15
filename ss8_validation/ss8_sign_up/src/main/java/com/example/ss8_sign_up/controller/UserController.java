package com.example.ss8_sign_up.controller;

import com.example.ss8_sign_up.dto.UserDTO;
import com.example.ss8_sign_up.model.User;
import com.example.ss8_sign_up.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @GetMapping
    public String display(Model model) {
        model.addAttribute("user",this.iUserService.display());
        return ("/list");
    }
    @GetMapping("/create-form")
    public String createForm(Model model) {
        model.addAttribute("users",new UserDTO());
        return "/create";
    }
    @PostMapping("/create")
    public String createUser(@Validated @ModelAttribute(name = "users") UserDTO userDTO, BindingResult bindingResult) {
        new UserDTO().validate(userDTO, bindingResult);
        if(bindingResult.hasErrors()) {
            return ("/create");
        }
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);
        this.iUserService.save(user);
        return ("redirect:/users");
    }

}
