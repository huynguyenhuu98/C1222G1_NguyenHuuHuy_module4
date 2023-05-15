package com.example.ss2_calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {
    @Override
    public int result(String operator, int firstNumber, int secondNumber) {
        String message = "Cannot division for zero";
        switch (operator) {
            case "Addition":
                return firstNumber + secondNumber;
            case "Subtraction":
                return firstNumber - secondNumber;
            case "Multiplication":
                return firstNumber * secondNumber;
            case "Division":
                if (secondNumber == 0) {
                    System.out.println(message);
                } else {
                    return firstNumber / secondNumber;
                }
        }
        return 0;
    }
}
