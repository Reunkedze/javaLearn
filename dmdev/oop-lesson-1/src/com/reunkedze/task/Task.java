package com.reunkedze.task;

/**
 *
 */
public class Task {
    public static void main(String[] args) {
        months(9);
        moduleThree(43);
        finals(112);
        visocos(2000);
    }

    public static void months(int month) {
//        зима - 12, 1, 2
//        весна - 3, 4, 5
//        лето - 6, 7, 8
//        осень - 9, 10, 11
        if (month >= 1 && month < 3 || month == 12) {
            System.out.println("Зима");
        } else if (month >= 3 && month < 6) {
            System.out.println("Весна");
        } else if (month >= 6 && month < 9) {
            System.out.println("Лето");
        } else if (month >= 9 && month < 12) {
            System.out.println("Осень");
        } else {
            System.out.println("Месяц вееден не корректно");
        }
    }

    public static void moduleThree (int value) {
        if (value % 10 == 3) {
            System.out.println("Последняя цифра числа является 3");
        }
    }

    public static void finals(int rubles) {
//        рубль 1 !11
//        рублей 5-19
//        рубля 2, 3, 4
        if (rubles % 10 == 1 && rubles % 100 != 11) {
            System.out.println(rubles + " рубль");
        } else if ((rubles % 10 == 2 || rubles % 10 == 3 || rubles % 10 == 4)
                && !(rubles % 100 == 12 || rubles % 100 == 13 || rubles % 100 == 14)){
            System.out.println(rubles + " рубля");
        } else {
            System.out.println(rubles + " рублей");
        }
    }

    public static void visocos(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
    }
}
