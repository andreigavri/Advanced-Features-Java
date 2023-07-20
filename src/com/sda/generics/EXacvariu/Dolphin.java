package com.sda.generics.EXacvariu;

public class Dolphin extends AquaticAnimal{
    private String colour;

    public Dolphin(String name, String colour) {
        super(name);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "colour='" + colour + " , " + super.toString() + " } ";
    }
}
