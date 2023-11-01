package tugas_pbo;

import java.util.Scanner;

public class Tugas_PBO {
    public static void main(String[] args) {
        double Nilai1;
        double Nilai2;
        double hasil;


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 =keyboard.nextInt();
//
       // penjumlahan
        hasil = Nilai1 + Nilai2;
        System.out.println("Hasil = " + hasil);
// 
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
//
       // pengurangan
        hasil = Nilai1 - Nilai2;
        System.out.println("Hasil = " + hasil);
//
         System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
         // perkalian
        hasil = Nilai1 * Nilai2;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
//
//        // Pembagian
        hasil = Nilai1 / Nilai2;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();

        // Sisa Bagi
        hasil = Nilai1 % Nilai2;
        System.out.println("Hasil = " + hasil);
        
    }
}
    