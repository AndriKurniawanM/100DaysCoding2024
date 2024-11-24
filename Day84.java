
import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Meminta input dari pengguna
        System.out.print("Masukkan sebuah kalimat: ");
        String input = scanner.nextLine();
        // Menghapus semua tanda seru dari kalimat
        String tanpaTandaSeru = input.replace("!", "");
        // Menambahkan satu tanda seru di akhir kalimat
        String hasil = tanpaTandaSeru + "!";
        // Menampilkan hasil
        System.out.println("Output: " + hasil);
    }
}
