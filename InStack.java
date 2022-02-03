package com.company;

public class InStack {
    private int[] stack;
    private int top;
    private int size;

    public InStack() {
        top = -1;
        size = 50;
        stack = new int[50];
    }

    public InStack(int size) {
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    public boolean push(int item) {
        if (!isFull()) {
            top++;
            stack[top] = item;
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        return stack[top--];
    }

    public boolean isFull() {
        return (top == stack.length - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}