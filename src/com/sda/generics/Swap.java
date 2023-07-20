package com.sda.generics;

public class Swap {
    public static <T> void swap(T[] array, int index1, int index2 ){

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;


    }

    public static void main(String[] args) {
        Integer[]elements = {1,2,3,4,5,7,3};
        swap(elements, 0,4);
        for(Integer element : elements){
            System.out.println(element);
        }
    }
}
