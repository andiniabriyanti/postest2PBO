package com.mycompany.src.menu;

import java.util.ArrayList;
import java.util.List;

public final class Menu {
    private final List<MenuItem> daftarMenu;  // List sekarang spesifik bertipe MenuItem

    public Menu() {
        daftarMenu = new ArrayList<>();
    }

    // Metode untuk menambahkan item ke menu
    public void tambahMenuItem(MenuItem item) {
        daftarMenu.add(item);
    }

    // Metode untuk menampilkan daftar menu
    public void tampilkanMenu() {
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMenu.get(i).toString());
        }
    }

    // Metode untuk mendapatkan item menu
    public MenuItem getMenuItem(int indeks) {
        if (indeks >= 0 && indeks < daftarMenu.size()) {
            return daftarMenu.get(indeks);
        }
        return null;
    }

    public int getJumlahMenu() {
        return daftarMenu.size();
    }

    public void updateMenuItem(int indeks, String namaBaru, int hargaBaru) {
        MenuItem item = getMenuItem(indeks);
        if (item != null) {
            item.setNama(namaBaru);
            item.setHarga(hargaBaru);
        }
    }

    public void hapusMenuItem(int indeks) {
        if (indeks >= 0 && indeks < daftarMenu.size()) {
            daftarMenu.remove(indeks);
        }
    }

    public String getNamaItem(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getHarga(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
