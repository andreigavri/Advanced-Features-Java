package com.sda.generics;

public class GenericClass {
    public static <T> int countIf(T[] elements, ICondition<T> condition) {
        //metoda generica <unu sau mai multe tipuri>
        //tipul returnat
        //parametrii de tip generic fie clase de tip generic fie obiecte create de noi (orice altceva)
        int counter = 0;
        for (T element : elements) {
            if (condition.verifica(element)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Integer[] elemente = {1, 2, 5, 8, 10, 11};
        int counter = countIf(elemente, new ICondition<Integer>() {
            @Override
            public boolean verifica(Integer value) {
                return value % 2 == 0;
            }
        });
        System.out.println("Counter de elemente: " +counter);
    }
}
