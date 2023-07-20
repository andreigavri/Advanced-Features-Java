package com.sda.EX5;

public abstract class Person {
    protected String name;
    protected String address;

    public Person() { // Constructor ul in clasa => asa se initiaza
        this.name = ""; // empty field
        this.address = "";

    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "--->" + address;

    }
}
