package com.sda.EnumExercitii;

public enum WeekDay {
    LUNI,
    MARTI,
    MIERCURI,
    JOI,
    VINERI,
    SAMBATA,
    DUMINICA;


    //Similar cu if
    public boolean isWeekDay() {
        return this != SAMBATA && this != DUMINICA;

    }

    public boolean isHoliday() {
        return this == SAMBATA || this == DUMINICA;

    }

    public void whichIsGreater(WeekDay weekDay) { // Tipul enum-ului
        //Ordinal este o metoda predefinita enum, si returneaza pozitia (indexul) in cadrul enum -ului
        if (this.ordinal() < weekDay.ordinal()) {
            System.out.println("Inainte ");
        } else {
            System.out.println("Dupa");

        }
    }
}
