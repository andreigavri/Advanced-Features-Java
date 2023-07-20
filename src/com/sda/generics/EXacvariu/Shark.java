package com.sda.generics.EXacvariu;

public class Shark extends AquaticAnimal{
    private int noTeth;

    public Shark(String name, int noTeth) {
        super(name);
        this.noTeth = noTeth;
    }

    public int getNoTeth() {
        return noTeth;
    }

    public void setNoTeth(int noTeth) {
        this.noTeth = noTeth;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "noTeth=" + noTeth + " , " + super.toString() + " } ";
    }
}
