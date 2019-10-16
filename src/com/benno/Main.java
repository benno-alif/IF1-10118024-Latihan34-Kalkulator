package com.benno;
import java.util.Scanner;

    /*
        Nama        : Benno Alif Anggara
        Kelas       : IF1
        NIM         : 10118024
        Deskripsi   : Membuat Kalkulator Menggunakan Konsep OOP
     */

public class Main {

    public static void main(String[] args) {
	    Kalkulator calc = new Kalkulator();
	    Scanner scanner = new Scanner(System.in);

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        calc.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        calc.value2 = scanner.nextDouble();
        System.out.println();
        System.out.println("Hasil Pertambahan : " + calc.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + calc.kurangBilangan());
        System.out.println("Hasil Perkalian : " + calc.kaliBilangan());
        System.out.println("Hasil Pembagian : " + calc.bagiBilangan());
        System.out.println("Hasil Sisa : " + calc.sisaBilangan());

    }
}
