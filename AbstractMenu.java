package com.mycompany.src.menu;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMenu implements MenuOperasi {
    protected final List<MenuItem> daftarMenu;

    public AbstractMenu() {
        daftarMenu = new ArrayList<>();
    }

    @Override
    public void tambahMenuItem(MenuItem item) {
        daftarMenu.add(item);
    }

    @Override
    public void tampilkanMenu() {
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMenu.get(i).toString());
        }
    }

    public int getJumlahMenu() {
        return daftarMenu.size();
    }

    public MenuItem getMenuItem(int indeks) {
        if (indeks >= 0 && indeks < daftarMenu.size()) {
            return daftarMenu.get(indeks);
        }
        return null;
    }
}
