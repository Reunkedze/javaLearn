package com.reunkedze.lesson6;

public class ForExample {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            if (i == 5) {
                continue;
//                break;
            }
            System.out.println(i);
        }
    }

    private static void forExample() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
