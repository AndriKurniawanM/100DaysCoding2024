import java.math.BigInteger; //Untuk menggunakan BigInteger, perlu import
public class Day29 {
    public static void main(String[] args) {
        // Inisialisasi BigInteger
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger c = new BigInteger("48");
        BigInteger d = new BigInteger("6");
        
        // Operasi Aritmatika
        BigInteger jumlah = a.add(b);          // Penjumlahan (a+b)
        BigInteger kurang = b.subtract(a); // Pengurangan (b-a)
        BigInteger kali = a.multiply(b);    // Perkalian (a*b)
        BigInteger bagi = a.divide(a);     // Pembagian (b/a)

        // Hasil
        System.out.println("Penjumlahan: " + jumlah);
        System.out.println("Pengurangan: " + kurang);
        System.out.println("Perkalian: " + kali);
        System.out.println("Pembagian: " + bagi);

        // Operasi lainnya
        BigInteger mod = b.mod(a);           // Modulus (sisa pembagian)
        BigInteger gcd = d.gcd(c);           // GCD (Greatest Common Divisor) / (pembagi bersama terbesar) dapat digunakan untuk mencari pembagian yang sama tapi terbesar dari kedua angka
        BigInteger pangkat = b.pow(2);              // Eksponen (pangkat)

        System.out.println("Sisa bagi: " + mod);
        System.out.println("Pembagi terbesar: " + gcd); //GCD 48 dan 18 akan menghasilkan output 6, karena 6 adalah faktor terbesar yang membagi kedua angka tersebut.
        System.out.println("Pangkat: " + pangkat);
    }
}
