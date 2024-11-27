public class Day87 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Inisialisasi array
        numbers[2] = 100; // Mengubah elemen pada indeks ke-2 
      //(jika dalam baris kode dia ada baris ke tiga alias angka 30 jadi 100)

        // Menampilkan elemen array setelah perubahan
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
