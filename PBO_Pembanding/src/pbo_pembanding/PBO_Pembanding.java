
package pbo_pembanding;

import java.util.Scanner;

public class PBO_Pembanding {

    public static void main(String[] args) {
        int Nilai1;
        int Nilai2;
        boolean hasil;
        
        Scanner keyboard = new Scanner(System.in);
        
        // Operator pembanding lebih besar :
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
        hasil = Nilai1 > Nilai2;
        System.out.println("Apakah " + Nilai1 + " lebih besar " + Nilai2 + "?" );
        System.out.println("Jawabannya = " + hasil);
        
        // Operator pembanding lebih kecil :
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
        hasil = Nilai1 < Nilai2;
        System.out.println("Apakah " + Nilai1 + " lebih kecil " + Nilai2 + "?" );
        System.out.println("Jawabannya = " + hasil);
        
        // Operator pembanding Sama dengan :
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
        hasil = Nilai1 == Nilai2;
        System.out.println("Apakah " + Nilai1 + " sama dengan " + Nilai2 + "?" );
        System.out.println("Jawabannya = " + hasil);
        
        // Operator pembanding Tidak sama dengan :
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
        hasil = Nilai1 != Nilai2;
        System.out.println("Apakah " + Nilai1 + " Tidak sama dengan " + Nilai2 + "?" );
        System.out.println("Jawabannya = " + hasil);
        
        // Operator pembanding lebih besar sama dengan :
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
        hasil = Nilai1 >= Nilai2;
        System.out.println("Apakah " + Nilai1 + " Lebih besar sama dengan " + Nilai2 + "?" );
        System.out.println("Jawabannya = " + hasil);
        
        // Operator pembanding lebih kecil sama dengan :
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        
        hasil = Nilai1 <= Nilai2;
        System.out.println("Apakah " + Nilai1 + " Lebih kecil sama dengan " + Nilai2 + "?" );
        System.out.println("Jawabannya = " + hasil);
        

    }
    
}
