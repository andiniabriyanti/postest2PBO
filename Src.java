package com.mycompany.src;

import com.mycompany.src.menu.MenuItem;
import com.mycompany.src.menu.Makanan;
import com.mycompany.src.menu.Minuman;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public final class Src {
    public static void main(String[] args) {
        try (// Membuat menu baru
                Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            
            // Menambahkan beberapa item menu awal
            final List<MenuItem> daftarPesanan = new ArrayList<>();
            int totalHarga = 0;
            
            // Perulangan utama
            while (running) {
                System.out.println("\n===== Menu Utama =====");
                System.out.println("1. Tambah item menu");
                System.out.println("2. Lihat item yang dipesan");
                System.out.println("3. Update item menu yang dipesan");
                System.out.println("4. Hapus item menu yang dipesan");
                System.out.println("5. Selesaikan pesanan dan hitung total");
                System.out.print("Pilih opsi: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();  // Konsumsi newline
                
                switch (pilihan) {
                    case 1:
                        // Tambah item
                        System.out.print("Mau pesan makanan atau minuman? (Makanan/Minuman): ");
                        String jenis = scanner.nextLine();
                        System.out.print("Masukkan nama item: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan jumlah porsi: ");
                        int jumlahPorsi = scanner.nextInt();
                        System.out.print("Masukkan harga per porsi: ");
                        int hargaPerPorsi = scanner.nextInt();
                        scanner.nextLine();  // Konsumsi newline
                        
                        // Menambahkan menu sesuai jenis dan langsung ke daftar pesanan
                        MenuItem item;
                        if (jenis.equalsIgnoreCase("Makanan")) {
                            item = new Makanan(nama, hargaPerPorsi * jumlahPorsi);
                            daftarPesanan.add(item);
                            System.out.println("Makanan berhasil ditambahkan.");
                        } else if (jenis.equalsIgnoreCase("Minuman")) {
                            item = new Minuman(nama, hargaPerPorsi * jumlahPorsi);
                            daftarPesanan.add(item);
                            System.out.println("Minuman berhasil ditambahkan.");
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                        break;
                        
                    case 2:
                        // Lihat item yang dipesan
                        System.out.println("Daftar item yang dipesan:");
                        for (MenuItem pesanan : daftarPesanan) {
                            System.out.println(pesanan.getNama() + " - Rp " + pesanan.getHarga());
                        }
                        break;
                        
                    case 3:
                        // Update item
                        System.out.print("Masukkan nomor item yang ingin di-update: ");
                        int indeksUpdate = scanner.nextInt() - 1;
                        scanner.nextLine();  // Konsumsi newline
                        if (indeksUpdate >= 0 && indeksUpdate < daftarPesanan.size()) {
                            System.out.print("Masukkan nama baru: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan harga baru: ");
                            int hargaBaru = scanner.nextInt();
                            scanner.nextLine();  // Konsumsi newline
                            daftarPesanan.get(indeksUpdate).setNama(namaBaru);
                            daftarPesanan.get(indeksUpdate).setHarga(hargaBaru);
                            System.out.println("Makanan/Minuman berhasil diupdate.");
                        } else {
                            System.out.println("Nomor item tidak valid.");
                        }
                        break;
                        
                    case 4:
                        // Hapus item
                        System.out.print("Masukkan nomor item yang ingin dihapus: ");
                        int indeksHapus = scanner.nextInt() - 1;
                        scanner.nextLine();  // Konsumsi newline
                        if (indeksHapus >= 0 && indeksHapus < daftarPesanan.size()) {
                            daftarPesanan.remove(indeksHapus);
                            System.out.println("Makanan/Minuman berhasil dihapus.");
                        } else {
                            System.out.println("Nomor item tidak valid.");
                        }
                        break;
                        
                    case 5:
                        // Selesaikan pesanan dan hitung total
                        System.out.println("\nDaftar Pesanan Anda:");
                        for (MenuItem pesanan : daftarPesanan) {
                            System.out.println("- " + pesanan.getNama() + " - Rp " + pesanan.getHarga());
                            totalHarga += pesanan.getHarga();
                        }
                        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
                        running = false;  // Keluar setelah selesai
                        break;
                        
                    default:
                        System.out.println("Pilihan tidak valid, silakan coba lagi.");
                }
            }
        }
        System.out.println("Program selesai.");
    }
}
