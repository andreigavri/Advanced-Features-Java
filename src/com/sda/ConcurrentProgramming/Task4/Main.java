package com.sda.ConcurrentProgramming.Task4;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(14.5);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account1.pay(15.56);
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account1.transferMoney(20.15);
            }
        });
        t2.start();

    }
}
