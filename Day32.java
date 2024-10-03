public class Day32 {
    public static void main(String[] args) {
        // Di sini kita punya variabel 'a', isinya angka 10
        int a = 10;
        // Lalu kita ubah angka 'a' jadi teks (String) pakai 'String.valueOf'
        String b = String.valueOf(a); //Kalau mau solusi yang fleksibel buat tipe data lain
        // Di sini kita juga bisa ubah angka 'a' jadi teks dengan trik menambahkan "" (string kosong)
        String c = a + ""; /*Kalau mau yang simpel dan cepat tanpa peduli soal gaya kode, jika itu angka
        maka akan memaksa angka itu jadi string dengan cara menggabungkannya dengan string kosong.*/
        // Ini cara lain buat ubah angka 'a' jadi teks, pakai 'Integer.toString'
        String d = Integer.toString(a); 
        /*Kalau mau ubah angka jadi string dengan cara standar,ini hanya berlaku buat angka (integer). 
        Jadi kalau kamu coba pakai ini untuk selain angka, bakal error.*/
        // Kita cetak angka asli, yaitu 'a', hasilnya ya 10 karena belum diubah
        System.out.println(a);
        // Cetak 'b', tapi karena 'b' adalah angka sekarang teks "10", jadinya ditambahin 1 jadi "101" , 1 tidak dibaca angka.
        System.out.println(b + 1);
        // Cetak 'c', hasilnya "102" (sama kayak sebelumnya, angka 10 berubah jadi teks,  2 tidak dibaca angka.)
        System.out.println(c + 2);
        // Cetak 'd', hasilnya "103" (sama juga, angka 10 diubah jadi teks,  3 tidak dibaca angka.)
        System.out.println(d + 3);
    }
}
