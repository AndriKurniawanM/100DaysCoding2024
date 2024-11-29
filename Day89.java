import java.util.Scanner;

public class Day89 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa (maksimal 10): ");
        int jumlah = z.nextInt();

        if (jumlah <= 10) {
            String[] nama = new String[jumlah];

            // Input nama siswa
            for (int i = 0; i < jumlah; i++) {
                System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
                nama[i] = z.next();
            }

            // Output daftar nama siswa
            System.out.println("Daftar nama siswa:");
            for (int i = 0; i < jumlah; i++) {
                System.out.println((i + 1) + ". " + nama[i]);
            }
        } else {
            System.out.println("Jumlah siswa tidak boleh lebih dari 10.");
        }

        z.close(); // Tutup Scanner
    }
}
