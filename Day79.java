public class Day79{
    public static void main(String[] args) {
        Mahasiswa data = new Mahasiswa("Andri", 18);
        // Menggunakan toString() untuk mencetak representasi objek
        System.out.println(data); //memanggil variabel data untuk dicetak keseluruhan 
    }
}
class Mahasiswa {
    private String nama;
    private int umur;
    // Constructor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    // Override metode toString()
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur;
    }
}
