package com.company;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // int getNumber;
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);

        int getNumber = input.nextInt();

        if ((getNumber % 5 == 0) && (getNumber % 3 == 0)) {
            System.out.println("FizzBuzz");
        } else if (getNumber % 5 == 0) {
            System.out.println("Fizz");
        } else if (getNumber % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.printf("" + getNumber);
        }

    }
}
