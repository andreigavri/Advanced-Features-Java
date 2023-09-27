package com.sda.ConcurrentProgramming.Task1;

public class SecondIntervalCheck implements Runnable {

    @Override
    public void run() {
        for(int i = 14300; i<=17800; i++  ) {
         if(i%2==0){
             System.out.println(i+ "  " + Thread.currentThread().getName());

         }
        }
    }
}
