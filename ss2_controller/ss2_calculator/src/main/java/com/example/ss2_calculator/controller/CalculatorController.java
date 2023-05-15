package com.example.ss2_calculator.controller;

import com.example.ss2_calculator.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService iCalculatorService ;

    @GetMapping("/calculator")
    public String caculator(@RequestParam(defaultValue = "0", required = false, value = "firstNumber") int firstNumber,
                            @RequestParam(defaultValue = "0", required = false, value = "secondNumber") int secondNumber,
                            @RequestParam(defaultValue = "0", required = false, value = "operator" ) String operator , Model model) {
        model.addAttribute("result" ,iCalculatorService.result(operator,firstNumber,secondNumber));
        return "calculator";
    }
}
