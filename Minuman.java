package com.mycompany.src.menu;

public final class Minuman extends MenuItem {
    public Minuman(final String nama, final int jumlahPorsi) {
        super(nama, jumlahPorsi);
    }

    @Override
    public String toString() {
        return "Minuman: " + getNama() + " - " + getHarga() + " porsi";
    }
}
