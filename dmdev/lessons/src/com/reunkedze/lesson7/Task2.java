package com.reunkedze.lesson7;

public class Task2 {
    public static void main(String[] args) {
        int[][] values = new int[3][];
        values[0] = new int [5];
        values[1] = new int [2];
        values[2] = new int [1];
        printArray(values);
    }

    public static void test() {
        int[] values = {1, 2, 3, 4, 5};
        int[][] values2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int[] ints : values2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[][] values2) {
        for (int[] ints : values2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
