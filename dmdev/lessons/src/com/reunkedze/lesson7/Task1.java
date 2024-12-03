package com.reunkedze.lesson7;

public class Task1 {
    public static void main(String[] args) {
        int[] values = new int[10];
//        System.out.println(values[5]);
        values[4] = 9;
        values[7] = 98;

        for (int i = 0; i < values.length; i++) {
            System.out.println(i + ": " + values[i]);
        }
    }

    public static void test() {
        int value = 10;
        int[] values = {1, 3, 10, 6};
        System.out.println(values[3]);
        values[3] = 18;
        System.out.println(values[3]);
    }
}
