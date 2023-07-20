package com.sda.generics.EXacvariu;

public class Tuna extends AquaticAnimal{
    private String description;

    public Tuna(String name, String description) {
        super(name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tuna{" +
                "description='" + description + " , " + super.toString() + " } ";
    }
}
