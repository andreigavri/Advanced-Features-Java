package com.sda.MiniApp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Magazin implements IAfisareProdus {
    private String nume;
    private Map<Categorie, List<Produs>> produse;

    public Magazin() {
        this.produse = new HashMap<>();
    }

    public Magazin(String nume, Map<Categorie, List<Produs>> produse) {
        this.nume = nume;
        this.produse = produse;
    }

    public String getNume() {
        return nume;
    }

    public Map<Categorie, List<Produs>> getProduse() {
        return produse;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "nume='" + nume + '\'' +
                ", produse=" + produse +
                '}';
    }

    public void adaugaProdus(Produs produs) {

        List<Produs> listaProd = produse.get(produs.getCategorie()); //caut in lista de produse in categoria respectiva
        if (listaProd.contains(produs)) {
            Produs newProdus = listaProd
                    .stream()
                    .filter(produs1 -> produs1.getId().equals(produs.getId()))
                    .toList()
                    .get(0);

            newProdus.setStock(produs.getStock());
        } else {
            listaProd.add(produs);
        }
    }

    public void stergeProdus(Produs produs) {
        produse.get(produs.getCategorie()).remove(produs); //caut in lista de produse in categoria respectiva

    }

    @Override
    public void afisareProdus(Categorie criteriuFiltrare, int criteriuSortare) {
        List<Produs> listaProd = produse.get(criteriuFiltrare == null? criteriuFiltrare : Categorie.ALIMENTE); //caut in lista de produse in categoria respectiva

    listaProd.sort(new Comparator<Produs>() {
        @Override
        public int compare(Produs o1, Produs o2) {
            return criteriuSortare;
        }
    });

    }
}

