package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaration of variable
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Principle: ");
        double principal = input.nextDouble();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = input.nextFloat();

        System.out.print("Period (Years): ");
        int years = input.nextInt();

        float monthlyInterest = (annualInterestRate / PERCENTAGE) / MONTH_IN_YEAR;
        int numberOfPayment = years * MONTH_IN_YEAR;

        double upperCalc = monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayment));
        double lowerCalc = Math.pow((1 + monthlyInterest), numberOfPayment) - 1;
        double monthlyPayment = (principal * upperCalc) / lowerCalc;

        //String finalMortgage = "1234567";
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(monthlyPayment);
        System.out.println("Mortgage: " + result);

    }
}
