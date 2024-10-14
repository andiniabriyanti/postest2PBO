package com.mycompany.src.menu;

public abstract class MenuItem {
    protected final String nama;
    protected int harga;

    public MenuItem(final String nama, final int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setNama(final String nama) {
        System.out.println("Nama tidak dapat diubah karena 'final'.");
    }

    public void setHarga(final int harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Jumlah porsi harus lebih dari 0");
        }
    }
}
