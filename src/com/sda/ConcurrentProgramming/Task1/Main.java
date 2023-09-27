package com.sda.ConcurrentProgramming.Task1;

public class Main {
    public static void main(String[] args) {
        Thread firstIntervalCheck = new FirstIntervalCheck();
        Thread secondIntervalCheck = new Thread(new SecondIntervalCheck());
        firstIntervalCheck.start();
        secondIntervalCheck.start();

    }
}
