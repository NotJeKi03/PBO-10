/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum10;

/**
 *
 * @author zakik
 */
public class Main {

    public static void main(String[] args) {
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("penjumlahan: " + penjumlahan.hitung(10,5)); 
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("pengurangan: " + pengurangan.hitung(10,5));   
    }
}
