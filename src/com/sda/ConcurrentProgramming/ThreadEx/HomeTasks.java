package com.sda.ConcurrentProgramming.ThreadEx;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class HomeTasks {
    public static void main(String[] args) {
        ExecutorService executerService = Executors.newFixedThreadPool(2);
        // din Executors > apelam metodele pentru crearea unui ExecutorService
        // initializam un thread pool care permite rularea in acelasi timp a 2 thread-uri

        // cream o lista cu mai multe fire de executie care implementeaza callable
        // interfata Callable > call care returneaza ceva
        // interfata Runnable > run si nu returneaza nimic (void)
        // () -> intr-o lista List<Callable> List<Runnable> > cream un thread

        List<Callable<String>> tasks = Arrays.asList(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                    }
//                },
                () -> {
                    System.out.println("Thread: " + Thread.currentThread().getName());
                    System.out.println("I'm Shopping");
                    Thread.sleep(5000);
                    System.out.println("Thread: " + Thread.currentThread().getName() + ".Shopping dong");
                    return "Shopping done";
                },
                () -> {
                    System.out.println("Thread: " + Thread.currentThread().getName());
                    System.out.println("Washing dishes");
                    Thread.sleep(2000);
                    System.out.println("Thread: " + Thread.currentThread().getName() + ". Dishes washed");
                    return "dishes washed";
                },
                () -> {
                    System.out.println("Thread: " + Thread.currentThread().getName());
                    System.out.println("Cleaning the room");
                    Thread.sleep(1000);
                    System.out.println("Thread: " + Thread.currentThread().getName() + " . Room cleaned ");
                    return "Room cleaned";

                }
        );
        try {
            //            String firstResult = executorService.invokeAny(tasks);
//            System.out.println("FIRST RESULT: " + firstResult);

            List<Future<String>> futures=executerService.invokeAll(tasks);
            for(Future<String>future:futures){

                System.out.println(future.get());

            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();

        }
        executerService.shutdown(); //oprim exectureService si firele exectutie

    }
}

