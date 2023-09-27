package com.sda.ConcurrentProgramming.ThreadEx;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicsDemo {
    public static void main(String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(2);
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        // clasa AtomicInteger are mai multe metode pe care le putem apela
        // > get, pentru a obtine valoarea intr-un fir de executie
        // > getAndIncrement, pentru a obtine si creste valoarea intr-un fir de executie
        // > incrementAndGet, pentru a creste valoarea si apoi obtine intr-un fir de executie
        executorService.submit(new IncrementingThread(atomicInteger));
        executorService.submit(new IncrementingThread(atomicInteger));
        executorService.shutdown();
    }
}
class IncrementingThread implements Runnable{
    private final AtomicInteger value;
    IncrementingThread(final AtomicInteger value){
        this.value= value;
    }


    @Override
    public void run() {
        for(int idx = 0; idx < 1000; idx++){
            value.incrementAndGet(); //crestem valoarea vaiabilei de tip atomic

        }
        System.out.println(value.get());
    }
}
