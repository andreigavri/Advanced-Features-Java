package com.sda.ConcurrentProgramming.Task1;

public class FirstIntervalCheck extends Thread {

    @Override
    public void run() {
        for (int i = 1000; i <= 2000; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "  " + Thread.currentThread().getName());
            }
        }
    }
}