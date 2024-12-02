public class Day92 {
    public static void main(String[] args) {
        int n = 8; // Jumlah baris pola
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                if (j == i || j == (2 * n - 2 - i)) { // Kondisi mencetak sisi kiri dan kanan V
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
