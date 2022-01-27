package com.company;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner inputText1 = new Scanner(System.in);
    System.out.print("Principle: ");
    double principal = inputText1.nextDouble();

    Scanner inputText2 = new Scanner(System.in);
    System.out.print("Annual Interest Rate: ");
    float annualInterestRate = inputText2.nextFloat();

    Scanner inputText3 = new Scanner(System.in);
    System.out.print("Period (Years): ");
    int years = inputText3.nextInt();

    float monthlyInterest = (annualInterestRate /100)/12;
    int numberOfPayment = years * 12;

    double upperCalc = monthlyInterest * (Math.pow((1+monthlyInterest), numberOfPayment));
    double lowerCalc = Math.pow((1+monthlyInterest),numberOfPayment)-1;
    double monthlyPayment = (principal * upperCalc)/lowerCalc;

    //String finalMortgage = "1234567";
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(monthlyPayment);
    System.out.println("Mortgage: "+result);

    }
}
