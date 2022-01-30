package com.company;


// Ternery Operator in Java
public class Ternary {
    public static void main(String[] args) {
        int income = 120_000;
//        String className = "Economy";
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
    }
}