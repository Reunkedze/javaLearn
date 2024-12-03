package com.reunkedze.lesson6.task;

public class Task4 {
    public static void main(String[] args) {
        int value = 29;
        boolean result = isSimple(value);
        System.out.println(result);
    }

    public static boolean isSimple(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
