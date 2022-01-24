package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 55;
        // String Rep of Arrays
        String msg = Arrays.toString(numbers);
        System.out.println(msg);
    }
}
