package com.sda.EnumExercitii;

public class Main {
    public static void main(String[] args) {
        WeekDay luni = WeekDay.LUNI; //Asa se creaza un obiect in enum
        WeekDay marti = WeekDay.MARTI;
        WeekDay weekEnd = WeekDay.DUMINICA;

        System.out.println(luni.isHoliday());
        System.out.println(marti.isWeekDay());
        weekEnd.whichIsGreater(luni);
        luni.whichIsGreater(marti);
    }

}
