package com.reunkedze.lesson5;

public class Task1 {
    public static void main(String[] args) {
        int value1 = 50;
        int value2 = 10;
        System.out.println(getMax(value1, value2));
    }

    public static int getMax(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        }
        return value2;
    }
}
