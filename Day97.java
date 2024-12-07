public class Day97 {
    public static void main(String[] args) {
        int n = 10; // Ubah nilai n sesuai kebutuhan
        System.out.print("Bilangan prima dari 1 hingga " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (i == 1) continue; // Lewati angka 1 karena bukan bilangan prima
            boolean isPrima = true; // Asumsikan bilangan prima
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) { // Jika ditemukan pembagi lain selain 1 dan dirinya sendiri
                    isPrima = false;
                    break;
                }
            }
            if (isPrima) { // Jika masih dianggap prima
                System.out.print(i + " ");
            }
        }
    }
}
