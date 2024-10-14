package com.mycompany.src.pemesanan;

import com.mycompany.src.menu.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pemesanan {
    private final Menu menu;
    private final List<String> daftarPesanan;
    private int totalHarga;

    public Pemesanan(Menu menu) {
        this.menu = menu;
        this.daftarPesanan = new ArrayList<>();
        this.totalHarga = 0;
    }

    public void prosesPesanan() {
        Scanner scanner = new Scanner(System.in);
        boolean lanjutkan = true;

        while (lanjutkan) {
            System.out.print("Masukkan nomor menu yang ingin dipesan (0 untuk selesai): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                lanjutkan = false;
            } else if (pilihan > 0 && pilihan <= menu.getJumlahMenu()) {
                String namaItem = menu.getNamaItem(pilihan - 1);
                int hargaItem = menu.getHarga(pilihan - 1);
                daftarPesanan.add(namaItem);
                totalHarga += hargaItem;
                System.out.println(namaItem + " telah ditambahkan ke pesanan Anda.");
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void tampilkanDaftarPesanan() {
        System.out.println("Daftar pesanan Anda:");
        for (String item : daftarPesanan) {
            System.out.println("- " + item);
        }
    }
}
