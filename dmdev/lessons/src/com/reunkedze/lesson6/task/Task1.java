package com.reunkedze.lesson6.task;

public class Task1 {
    public static void main(String[] args) {
        int value = 16;
        int factorial = factorialWhile(value);
        System.out.println(factorial);
    }

    public static int factorialWhile(int value) {
        int result = 1;
        int i = 1;
        while (i <= value) {
            result *= i;
            i++;
        }
        return result;
    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
