package com.sda.ConcurrentProgramming.Task3;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random random = new Random();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        int[] array = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];


            }

            String result =executorService.invokeAny(Arrays.asList(new BubbleSortStrategy(array), new InsertionSortStrategy(array2)));
            System.out.println(result);
        }
    }