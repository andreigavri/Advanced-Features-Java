package com.sda.EX1;

public class Student {
    private String firstName;
    private String lastName;
    private int noIndex;
    private String fieldOfStudy;
    public Student() {
    }
    public Student(String firstName, String lastName, int noIndex, String fieldOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.noIndex = noIndex;
        this.fieldOfStudy = fieldOfStudy;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    private String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getNoIndex() {
        return noIndex;
    }
    public void setNoIndex(int noIndex) {
        this.noIndex = noIndex;
    }
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", noIndex=" + noIndex +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}