package com.sda.Collections;

public class MainSdaArrays {
    public static void main(String[] args) {
        SDAArrayList<Integer> arrayList= new SDAArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(2);
        try{
            System.out.println(arrayList.get(7));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
       // System.out.println(arrayList.get(7));
        System.out.println(arrayList.get(1));
        try{
            arrayList.remove(6);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        arrayList.remove(0);
        System.out.println(arrayList.get(0));
    }
}
