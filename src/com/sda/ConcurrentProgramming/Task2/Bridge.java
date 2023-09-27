package com.sda.ConcurrentProgramming.Task2;

public class Bridge {

    public synchronized void driveThrough(Car car) {
        System.out.println("Car on the bridge: " + car);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("Error Pending... ");
        }
    }
}
