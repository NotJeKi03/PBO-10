/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas10;

/**
 *
 * @author zakik
 */
public class Main {
    public static void main(String[] args) {
        Elektronik produkElektronik = new Elektronik();
        Makanan produkMakanan = new Makanan();

        double hargaElektronik = 2000000;
        double hargaMakanan = 50000;

        double pajakElektronik = produkElektronik.hitungPajak(hargaElektronik);
        double pajakMakanan = produkMakanan.hitungPajak(hargaMakanan);

        System.out.println("Harga Elektronik: " + hargaElektronik);
        System.out.println("Pajak Elektronik (10%): " + pajakElektronik);
        System.out.println("Total Elektronik (Harga + Pajak): " + (hargaElektronik + pajakElektronik));

        System.out.println("\nHarga Makanan: " + hargaMakanan);
        System.out.println("Pajak Makanan (5%): " + pajakMakanan);
        System.out.println("Total Makanan (Harga + Pajak): " + (hargaMakanan + pajakMakanan));
    }
}