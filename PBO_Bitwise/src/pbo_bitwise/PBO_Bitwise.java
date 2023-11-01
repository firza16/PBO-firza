package pbo_bitwise;

import java.util.Scanner;

public class PBO_Bitwise {


    public static void main(String[] args) {
        
        
        int Nilai1, Nilai2, hasil;
        Scanner keyboard = new Scanner(System.in);
        
        //Bitwise AND
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-1: ");
        Nilai2 = keyboard.nextInt();
        
        hasil = Nilai1 & Nilai2;
        System.out.println("Operator Bitwise AND");
        System.out.println("Hasil dari Nilai1 & Nilai2 : " + hasil);
        
        //Bitwise OR
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-1: ");
        Nilai2 = keyboard.nextInt();
        
        hasil = Nilai1 | Nilai2;
        System.out.println("Operator Bitwise OR ");
        System.out.println("Hasil dari Nilai1 | Nilai2 : " + hasil);
        
        //Bitwise XOR
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-1: ");
        Nilai2 = keyboard.nextInt();
        
        hasil = Nilai1 ^ Nilai2;
        System.out.println("Operator Bitwise XOR");
        System.out.println("Hasil dari Nilai1 ^ Nilai2 : " + hasil);
        
        //Bitwise Negasi
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        
        hasil = ~Nilai1;
        System.out.println("Operator Bitwise Negasi");
        System.out.println("Hasil Negasi Nilai1 : " + hasil);
        
        //Bitwise Left Shift
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-1: ");
        Nilai2 = keyboard.nextInt();
        
        hasil = Nilai1 << Nilai2;
        System.out.println("Operator Bitwise Left Shift");
        System.out.println("Hasil dari Nilai1 << Nilai2 : " + hasil);
        
        //Bitwise Right Shift
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-1: ");
        Nilai2 = keyboard.nextInt();
        
        hasil = Nilai1 >> Nilai2;
        System.out.println("Operator Bitwise Right Shift");
        System.out.println("Hasil dari Nilai1 >> Nilai2 : " + hasil);
        
        
    }
    
}
