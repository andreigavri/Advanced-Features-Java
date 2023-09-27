package com.sda.Practice;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){

        UserComparable[] users= new UserComparable[]{
                new UserComparable("Peter", 40), new UserComparable("John", 23) };
        Arrays.sort(users); // This method users an implementation of the Comparable interface to sort the array

        System.out.println(Arrays.toString(users)); // output [User{name='John', age=23}, User{name='Peter', age=40}]
    }
}



