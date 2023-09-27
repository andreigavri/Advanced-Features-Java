package com.sda.ConcurrentProgramming.Task4;

public class BankAccount {
    private double availableAmount;

    public BankAccount(double availableAmount) {
        this.availableAmount = availableAmount;
    }

    public synchronized void transferMoney(double amount) {
        availableAmount += amount;
        System.out.println(availableAmount);
        notify();

    }

    public synchronized void pay(double amount) {
        while (amount > availableAmount) {
            System.err.println("Unsufficient founds");
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        availableAmount -= amount;
        System.out.println("Available amount " + availableAmount);
    }
}
