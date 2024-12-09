package com.reunkedze.oopLesson2;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.printState();

        Computer computer1 = new Computer(1050);
        computer1.printState();

        Computer computer2 = new Computer(10000, 10000);
        computer2.printState();
    }
}
