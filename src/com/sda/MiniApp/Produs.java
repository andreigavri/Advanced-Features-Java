package com.sda.MiniApp;

import java.util.Objects;

public class Produs {
    private String id;
    private String nume;
    private double pret;
    private int stock;
    private Categorie categorie;

    public Produs(String id, String nume, double pret, int stock, Categorie categorie) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
        this.stock = stock;
        this.categorie = categorie;
    }

    public String getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public int getStock() {
        return stock;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "id='" + id + '\'' +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                ", stock=" + stock +
                ", categorie=" + categorie +
                '}';
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produs produs)) return false;
        return Double.compare(produs.getPret(), getPret()) == 0 && Objects.equals(getId(), produs.getId()) && Objects.equals(getNume(), produs.getNume()) && getCategorie() == produs.getCategorie();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNume(), getPret(), getStock(), getCategorie());
    }
}
