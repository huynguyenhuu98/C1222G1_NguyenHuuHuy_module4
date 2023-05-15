package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.controller.service.IMoneyService;
import com.example.controller.service.MoneyService;

@Controller
@RequestMapping("/money")
public class ChangeMoney {
    IMoneyService iMoneyService = new MoneyService();
    @GetMapping
    private String result(@RequestParam(defaultValue = "0") Float usd, Model model) {
        float vnd = iMoneyService.money(usd);
        model.addAttribute("usd",usd);
        model.addAttribute("vnd",vnd);
        return "listMoney";
    }
}
