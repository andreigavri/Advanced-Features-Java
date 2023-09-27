package com.sda.Practice;

public class UserComparable implements Comparable<UserComparable> {
    private String name;
    private int age;


    public UserComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;

    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "UserComparable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(UserComparable o) {
        return  this.getAge() - o.age;
    }
}
