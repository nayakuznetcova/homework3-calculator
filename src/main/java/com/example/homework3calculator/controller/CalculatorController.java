package com.example.homework3calculator.controller;

import com.example.homework3calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {


    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String resultPlus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return num1 + "+" + num2 + "=" + calculatorService.resultPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String resultMinus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return num1 + "+" + num2 + "=" + calculatorService.resultMinus(num1, num2);
    }

    @GetMapping(path = "/multuply")
    public String resultMultiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return num1 + "*" + num2 + "=" + calculatorService.resultMultiply(num1, num2);
    }

    @GetMapping(path = "/divade")
    public String resultDivade(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return num1 + "*" + num2 + "=" + calculatorService.resultDivide(num1, num2);
    }

}
