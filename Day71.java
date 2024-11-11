public class Day71 {
    // Method static untuk menjumlahkan dua angka
    public static int jumlah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Memanggil method static jumlah dan menyimpan hasilnya ke variabel result
        int jumlah = Day71.jumlah(3, 5);
        System.out.println("Hasil penjumlahan: " + jumlah);
    }
}
