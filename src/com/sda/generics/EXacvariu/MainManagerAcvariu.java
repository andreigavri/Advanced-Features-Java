package com.sda.generics.EXacvariu;

public class MainManagerAcvariu {
    public static void main(String[] args) {
        Acvariu<Dolphin> dolphin1 = new Acvariu<>("Acvariu de delfin");
        Acvariu<Shark> shark1 = new Acvariu<>("Acvariu de rechin");
        Acvariu<Tuna> tuna1 = new Acvariu<>("Acvariu de Tuna");
        dolphin1.addfishes(new Dolphin[]{new Dolphin("Jonny","Blue")});
        shark1.addfishes(new Shark[]{new Shark("Samuel", 5)});
        tuna1.addfishes(new Tuna[]{new Tuna("Little Mr.Pump","loves people")});
        System.out.println(dolphin1);
        System.out.println("------------------------------------------------");
        System.out.println("Afisarea numarului de pesti de tip Dolhpine in acvariu : " + dolphin1.noFishes());
        System.out.println("-------------------------------------------------");
        System.out.println(shark1);
        System.out.println("---------------------------------------------------");
        System.out.println("Afisarea numarului de pesti de tip Shark in acvariu : "  + shark1.noFishes());
        System.out.println("----------------------------------------------------");
        System.out.println(tuna1);
        System.out.println("-----------------------------------------------------");
        System.out.println("Afisarea numarului de pesti de tip tuna in acvariu : " + tuna1.noFishes());
    }
}
