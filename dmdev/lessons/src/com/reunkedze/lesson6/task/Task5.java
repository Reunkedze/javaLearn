package com.reunkedze.lesson6.task;

import java.sql.SQLOutput;

public class Task5 {
    public static void main(String[] args) {
        printLetters();
        System.out.println((char) 33);
    }

    public static void printLetters() {
        for (char letter = 'b'; !isVowel(letter); letter++) {
            System.out.println(letter);
        }
    }

    public static boolean isVowel(char value) {
        return value == 'a' || value == 'e' || value == 'y' || value == 'u' || value == 'i' || value == 'o';
    }
}
