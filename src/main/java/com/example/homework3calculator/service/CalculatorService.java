package com.example.homework3calculator.service;

import com.example.homework3calculator.exceptions.ExceptionsDivide;

public class CalculatorService implements CalculatorServiceInterface{
    @Override
    public String welcome() {
        return "<h1> Добро пожаловать в калькулятор </h1>";
    }

    @Override
    public Integer resultPlus(String num1, String num2) {
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        return result;
    }

    @Override
    public Integer resultMinus(String num1, String num2) {
        int result = Integer.parseInt(num1) - Integer.parseInt(num2);
        return result;
    }

    @Override
    public Integer resultMultiply(String num1, String num2) {
        int result = Integer.parseInt(num1) * Integer.parseInt(num2);
        return result;
    }

    @Override
    public Integer resultDivide(String num1, String num2) {
        if (Integer.parseInt(num2) == 0) {
            throw new ExceptionsDivide("На ноль делить нельзя");
        }
        return Integer.parseInt(num1) / Integer.parseInt(num2);
    }
}
