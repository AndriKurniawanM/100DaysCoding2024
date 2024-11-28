import java.util.Scanner;
public class Day88 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int a;
        double non,pns;
        non = 0.05;
        pns = 0.1;
        String b;
        System.out.print("Status Pegawai (PNS / BUKAN):");
        b = z.next();
        System.out.print("Masukkan Gaji Pokok Anda:");
        a = z.nextInt();
        if(a >= 2000000 && a <= 5000000){
            if(b.equalsIgnoreCase("PNS")){
                double e = pns*a;
                double h = a - e;
                int hasil = (int) h;
                System.out.println("Sisa gaji setelah pemotongan: " + "Rp " + hasil);
            } else { 
                double e = non*a;
                double h = a - e;
                int hasil = (int) h;
                System.out.println("Sisa gaji setelah pemotongan: " + "Rp " + hasil);
            }
    } else   if(a > 5000000){
        non = 0.07;
        pns = 0.12;
            if(b.equalsIgnoreCase("PNS")){
                double e = pns*a;
                double h = a - e;
                int hasil = (int) h;
                System.out.println("Sisa gaji setelah pemotongan: " + "Rp " + hasil);
            } else { 
                double e = non*a;
                double h = a - e;
                int hasil = (int) h;
                System.out.println("Sisa gaji setelah pemotongan: " + "Rp " + hasil);
            }
    } else  if(a < 2000000){
        pns = 0.05;
            if(b.equalsIgnoreCase("PNS")){
                double e = pns*a;
                double h = a - e;
                int hasil = (int) h;
                System.out.println("Sisa gaji setelah pemotongan: " + "Rp " + hasil);
            } else { 
                System.out.println("Sisa gaji setelah pemotongan: " + "Rp " + a + " (Tidak ada potongan)");
            }
    }
    }
}
//Gunakan kode dibawah jika ingin lebih simpel
/* import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input status pegawai dan gaji
        System.out.print("Status Pegawai (PNS / BUKAN): ");
        String status = scanner.next();
        System.out.print("Masukkan Gaji Pokok Anda: ");
        int gajiPokok = scanner.nextInt();

        // Tentukan potongan berdasarkan status dan gaji
        double potongan = hitungPotongan(gajiPokok, status);

        // Hitung sisa gaji setelah potongan
        int sisaGaji = (int) (gajiPokok - potongan);

        // Tampilkan hasil
        System.out.println("Sisa gaji setelah pemotongan: Rp " + sisaGaji);
    }

    // Metode untuk menghitung potongan gaji
    public static double hitungPotongan(int gaji, String status) {
        double persenPotongan;

        if (gaji >= 2000000 && gaji <= 5000000) {
            persenPotongan = status.equalsIgnoreCase("PNS") ? 0.1 : 0.05;
        } else if (gaji > 5000000) {
            persenPotongan = status.equalsIgnoreCase("PNS") ? 0.12 : 0.07;
        } else {
            // Tidak ada potongan untuk gaji < 2000000 jika bukan PNS
            return status.equalsIgnoreCase("PNS") ? gaji * 0.05 : 0;
        }

        return gaji * persenPotongan;
    }
}
*\
