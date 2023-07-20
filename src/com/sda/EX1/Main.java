package com.sda.EX1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Method[] methods = Student.class.getDeclaredMethods(); // Asa luam declared methodes
        Field[] fields = Student.class.getDeclaredFields();// asa obtinem campurile decalarate
        Constructor[] constructors = Student.class.getConstructors();//asa obitinem Constructorii
        for (Method method : methods) {//Itereaza prin vector creeand un obiect pentru fiecare element
            System.out.println("Metodele " + method);
        }
        for (Field field : fields) {
            System.out.println("Fields : " + field);
        }
        for (Constructor constructor : constructors) {
            System.out.println("Construcorii : " + constructor);
        }
        //Luam construcorul din cadrrul clasei cu parametri de tipul respectiv
        Student student = Student.class.getConstructor(String.class, String.class, int.class, String.class)
                .newInstance("Gigel", "Maria", 14, "Mara");
        System.out.println(student);
        //Luam metoda cu numele din paranteza
        Method getLastNameMethod = Student.class.getDeclaredMethod("getLastName");
        // Daca e privata setam setAccessible(true)
        getLastNameMethod.setAccessible(true);
        //invoke apeleaza metoda pentru obiectul primit ca parametru
        System.out.println(getLastNameMethod.invoke(student));
        //getDeclaredField obitinem campul specificat in paranteza
        Field lastNameField = Student.class.getDeclaredField("lastName");
        lastNameField.setAccessible(true);
        // set , seteaza campul obiectului primit ca parametru cu valoarea primita ca parametru
        lastNameField.set(student, "Mocanu");
        System.out.println(student);
    }
}