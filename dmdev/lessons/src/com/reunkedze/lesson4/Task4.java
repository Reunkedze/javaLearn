package com.reunkedze.lesson4;

public class Task4 {
    public static void main(String[] args) {
        int value = 2001;
        System.out.println(isLeapYear(value));
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0);
    }

}