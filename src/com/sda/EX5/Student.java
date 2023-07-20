package com.sda.EX5;

public class Student extends Person {

    private String typeOfStudy;
    private int yearOfStudy;
    private double studyPrice;


    public Student(String typeOfStudy, int yearOfStudy, double studyPrice) {
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;

    }
    public Student(String typeOfStudy, int yearOfStudy, double studyPrice, String name, String address){
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;

    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public double getStudyPrice() {
        return studyPrice;

    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;

    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setStudyPrice(double studyPrice) {
        this.studyPrice = studyPrice;
    }

    @Override //am generat metoda toString
    public String toString() {
        return "Student{" +
                "typeOfStudy='" + typeOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", studyPrice=" + studyPrice + " " + super.toString() +  // am apelat super  din Person // POLIMORFISM
                '}';
    }
}
