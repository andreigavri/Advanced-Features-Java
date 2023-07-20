package com.sda.Exceptions;

public class Main {

    public static float divide(int a , int b) {
        if (b == 0) {
            throw new CannotDivedBy0Exception("b is zero");
        } else {
            return a / b;
        }
    }
    public static void main(String[] args) {
        System.out.println(divide(10,5));
        divide(6, 0);

    }
}
