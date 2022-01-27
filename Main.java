package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // String Rep of Arrays Old Method
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 55;
        String msg = Arrays.toString(numbers);
        //System.out.println(msg);

        // String Rep of Arrays New Method
        int[] num2 = {2,9,4,3,1,7,15,9};
        Arrays.sort(num2);
        // System.out.println(Arrays.toString(num2));

        // Multi Dimentional Array //
        int[][] num3 = new int[2][3]; // 2rows x 3column
        num3[1][0] = 777;
        // Printing Multi Dim Arrary
        // System.out.println(Arrays.deepToString(num3));

        int[][] num4 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(num4));

    }
}
