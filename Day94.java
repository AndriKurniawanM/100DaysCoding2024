public class Day94 {
    public static void main(String[] args) {
        int n = 5;  // Tetapkan nilai n secara langsung, n = jumlah alias tinggi segitiga
        for (int i = 1; i <= n; i++) {
            // Cetak spasi
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
