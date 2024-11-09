import java.util.Scanner;
/*
    Ini adalah dokumentasi 
Soal 1 = Buatlah program Java untuk menghitung faktorial dari sebuah angka yang dimasukkan
oleh pengguna. Gunakan loop for dengan decrement untuk menghitung factorial
Soal 2 = Buatlah program Java yang mencetak deret angka dengan pola berikut menggunakan loop 
for
Soal 3 = Buatlah program Java yang meminta pengguna untuk memasukkan angka menggunakan 
do-while loop. Program akan memeriksa apakah angka tersebut merupakan kelipatan 2, 
kelipatan 3, atau kelipatan 2 dan 3.
• Jika angka tersebut adalah kelipatan 2, tampilkan pesan: Angka adalah kelipatan 2.
• Jika angka tersebut adalah kelipatan 3, tampilkan pesan: Angka adalah kelipatan 3.
• Jika angka tersebut adalah kelipatan 2 dan kelipatan 3, program akan meminta 
pengguna untuk memasukkan angka lagi hingga mendapatkan angka yang bukan 
kelipatan 2 dan 3
Soal 4 = Buatlah sebuah method void bernama calonprogrammer yang menerima parameter String 
nama. Method ini harus mencetak pesan salam ke layar, seperti "Halo, [nama]!".
Soal 5 = Buatlah sebuah perkalian sederhana dengan menggunakan method non void 
Soal 6 = Buatkan sebuah pola berbentuk segitiga sama kaki
*/
public class Day69 {
    public static void main(String[] args) {
        System.out.println("-------------SOAL 1---------------");
        Scanner z = new Scanner(System.in);
        int a,b;
        System.out.print("Masukkan angka = ");
        a = z.nextInt();
        b = 1;
        System.out.print(a + "! = ");
        A:
        for (int i = a; i > 0; i--) {
            b *= i;
            System.out.print(i);
            if (i > 1 ) {
                System.out.print(" x ");
            } else {
                break A;
            }
        } System.out.println(" = " + b);
        System.out.println("-------------SOAL 2---------------");
        int l = 1;
        B:
        for (int w = 1; w <= 4; w++) {
            for (int k = 1; k <= w; k++) {
                System.out.print(l + " ");
                if (l >= 1){
                l++;
                } else {
                    break B;
                }
            } System.out.println();   
        } 
        System.out.println("-------------SOAL 3---------------");
        int in;
        do {
            System.out.print("Masukkan angka: "); 
            in = z.nextInt();
            System.out.print("Angka adalah ");
            if (in % 2 == 0 && in % 3 == 0) {
                System.out.println("kelipatan 2 & 3. Masukkan angka lagi");
            } else if (in % 2 == 0) {
                System.out.println("kelipatan 2");
                break;
            } else if (in % 3 == 0) {
                System.out.println("kelipatan 3");
                break;
            } else {
                System.out.println("bukan kelipatan 2 maupun 3");
                break;
            }
        } while (true);
          System.out.println("Program selesai");
        System.out.println("-------------SOAL 4---------------");
        calonprogrammer ("Andri");
        calonprogrammer ("Adam");
        calonprogrammer ("Patima");
        calonprogrammer ("Rusna");
        System.out.println("-------------SOAL 5---------------");
        int hasil = nomor(5, 2); 
        System.out.println("Hasil perkalian = " + hasil);
        System.out.println("-------------SOAL 6---------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();                      
        }
    }
    //ini method void untuk soal 4
    public static void calonprogrammer(String nama) {
        System.out.println("Halo, " + nama + "!");
    }
    //ini method non void untuk soal no 5
     public static int nomor(int no1, int no2) 
    { 
        int hasil = no1 * no2; 
        return hasil; 
    } 
}
