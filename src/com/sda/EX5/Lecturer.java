package com.sda.EX5;

public class Lecturer extends Person {
    private String specialization;
    private double salary;

    public Lecturer(String specialization, double salary, String name, String address) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary + " " + super.toString() +
                '}';
    }
}

