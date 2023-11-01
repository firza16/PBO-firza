package pbo_penugasan;

import java.util.Scanner;

public class PBO_Penugasan {

    
    public static void main(String[] args) {
        // OPERATOR PENUGASAN
        
        double Nilai1;
        double Nilai2;
        
        Scanner keyboard = new Scanner(System.in);
        
        // pengisian dan penambahan :
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
        Nilai1 += Nilai2;
        System.out.println("Hasil = " + Nilai1);
        
        // pengisian dan pengurangan :
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
        Nilai1 -= Nilai2;
        System.out.println("Hasil = " + Nilai1);
        
        // pengisian dan perkalian :
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
        Nilai1 *= Nilai2;
        System.out.println("Hasil = " + Nilai1);
        
        // pengisian dan pembagian
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
        Nilai1 /= Nilai2;
        System.out.println("Hasil = " + Nilai1);
        
        // pengisian dan sisa bagi
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
        Nilai1 %= Nilai2;
        System.out.println("Hasil = " + Nilai1);
    }
    
}
