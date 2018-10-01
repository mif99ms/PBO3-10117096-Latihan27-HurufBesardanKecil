/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan27.hurufbesardankecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * KELAS        : PBO3
 * DESKRIPSI    : Program ini berisi program untuk menampilkan huruf besar dan 
 * kecil
 */
public class PBO310117096Latihan27HurufBesardanKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Masukkan kalimat : ");
      Scanner input = new Scanner(System.in);
      String kalimat = input.nextLine();
      System.out.println("Konversi ke kapital dari kalimat tersebut : ");
      String kapital = kalimat.toUpperCase();
      System.out.println(kapital);
      System.out.println("Konversi ke huruf kecil dari kalimat tersebut : ");
      String huruf_kecil = kalimat.toLowerCase();
      System.out.println(huruf_kecil);
    }
    
}
