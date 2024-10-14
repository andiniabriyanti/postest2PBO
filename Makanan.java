package com.mycompany.src.menu;

public final class Makanan extends MenuItem {
    public Makanan(final String nama, final int jumlahPorsi) {
        super(nama, jumlahPorsi);
    }

    @Override
    public String toString() {
        return "Makanan: " + getNama() + " - " + getHarga() + " porsi";
    }
}
