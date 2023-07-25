package com.example.homework3calculator.service;

public interface CalculatorServiceInterface {
    String welcome();

    Integer resultPlus(String num1, String num2);

    Integer resultMinus(String num1, String num2);

    Integer resultMultiply(String num1, String num2);

    Integer resultDivide(String num1, String num2);
}
