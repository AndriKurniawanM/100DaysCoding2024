package Andri;
import java.math.BigInteger;
import java.util.Scanner;
public class Day41 {
    public static void main(String[] args) {
        int a = 150;
        String b = Integer.toString(a);
        int c = Integer.valueOf(b);
        System.out.println("Hasil konversi integer ke String\t: " + b);
        System.out.println("Hasil konversi string kembali ke integer\t: " + c);
        System.out.println("__________________________________________");
        int d = 75;
        double e = (double) d;
        System.out.println("Nilai Int\t: " + d);
        System.out.println("Nilai setelah typecasting ke double\t:" + e);
        System.out.println("__________________________________________");
        BigInteger f = new BigInteger("98765432109876543210");
        BigInteger g = new BigInteger("12345678901234567890");
        BigInteger h = f.add(g);
        BigInteger i = f.multiply(g);
        System.out.println("Penjumlahan BigInteger\t: " + h);
        System.out.println("Perkalian BigInteger\t: " + i);
        System.out.println("__________________________________________");
        Scanner in = new Scanner(System.in);
        double j,k,l,m;
        System.out.print("Masukkan Panjang\t: ");
        j = in.nextDouble();
        System.out.print("Masukkan Lebar\t: ");
        k = in.nextDouble();
        l = j*k;
        m = 2*(j+k);
        System.out.println("Luas Persegi Panjang\t: "+l);
        System.out.println("Keliling Persegi Panjang\t: " +m);
        System.out.println("__________________________________________");
        int n;
        System.out.print("Masukkan Berat Badan\t: ");
        n = in.nextInt();
        double o,p;
        System.out.print("Masukkan Tinggi Badan\t: ");
        o = in.nextDouble();
        p = n / (o*o);
        System.out.println("Berat badan (kg)\t: " + n);
        System.out.println("Tinggi badan (meter)\t: " + o);
        System.out.println("BMI Anda Adalah\t: " + p);
        in.close();
        
        
        
        
        
        
    }
    
}
