package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean hasEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        int inputTemp = 15;
        if (inputTemp > 30) {
            System.out.println("Its a HOT day, Please Drink some water!!!");
        } else if (inputTemp <= 30 && inputTemp >= 20) {
            System.out.println("Its a nice day, enjoy!!!");
        } else {
            System.out.println("Its a cold day, stay at home !!!");
        }

    }
}
