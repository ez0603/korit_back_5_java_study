package com.study.exam04;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 20);
        int reault1 = calculator.sub(200, 100);
        System.out.println(result);
        System.out.println(reault1);
    }
}
