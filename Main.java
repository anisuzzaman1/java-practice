package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        InStack inStack = new InStack();

        if (!inStack.isFull()) {
            inStack.push(2);
            inStack.push(4);
            inStack.push(6);
            inStack.push(9);
        }
        System.out.println(inStack.pop());
        System.out.println(inStack.pop());

    }
}
