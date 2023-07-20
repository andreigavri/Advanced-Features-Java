package com.sda.EX5;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Licenta", 1990, 145.12, "Mihai", "Strada Nicolae Teclu");
        Lecturer lecturer1= new Lecturer("Inginer", 6500.123, "Ana", "Nechifor 21" );

        System.out.println(student1.getStudyPrice());
        System.out.println(lecturer1.getSalary());
        System.out.println(student1);
        System.out.println(lecturer1);

    }
}
