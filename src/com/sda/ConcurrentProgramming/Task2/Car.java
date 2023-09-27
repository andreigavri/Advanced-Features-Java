package com.sda.ConcurrentProgramming.Task2;

public class Car {
    private String carName;
    private String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }
}
