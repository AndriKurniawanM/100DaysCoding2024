import java.time.LocalTime;
import java.util.Scanner;
public class Day100 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan nama\t\t: ");
        String nama = z.nextLine();
        String pesan,isi,selesai;
        //Menentukan batas untuk kondisi if else
        LocalTime jam = LocalTime.now();
        LocalTime terbit = LocalTime.of(6,0);
        LocalTime pagi = LocalTime.of(11,59);
        LocalTime siang = LocalTime.of(12,0);
        LocalTime sore = LocalTime.of(16,59);
        LocalTime malam = LocalTime.of(17,00);
        if(jam.isAfter(terbit)&& jam.isBefore(pagi)){
            pesan = "Selamat pagi";
        }else if(jam.isAfter(siang)&& jam.isBefore(sore)){
            pesan = "Selamat siang";
        }else if(jam.isAfter(malam)){
            pesan = "Selamat malam"; 
        }else{
            pesan = "Selamat malam";
        }
        isi = pesan + ", " + nama;
        selesai = "Program Anda Telah Selesai";
        String[]namapesan = {isi,selesai}; //Untuk membuat text rata tengah nanti
         int lebarKotak = 50; // Lebar tetap untuk semua baris
        // Garis atas
        for (int i = 0; i < lebarKotak; i++) {
            System.out.print("=");
        }
        System.out.println();
        // Tampilkan setiap baris teks dengan align center / rata tengah
        for (String message : namapesan) {
            int padding = (lebarKotak - 2 - message.length()) / 2;
            int paddingRight = lebarKotak - 2 - message.length() - padding;
            System.out.print("|");
            for (int i = 0; i < padding; i++) {
                System.out.print(" ");
            }
            System.out.print(message);
            for (int i = 0; i < paddingRight; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        // Garis bawah
        for (int i = 0; i < lebarKotak; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
