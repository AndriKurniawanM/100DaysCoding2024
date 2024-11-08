public class Day68 {
    public static int nomor(int no1, int no2) 
    { 
        int hasil = no1 + no2; 
        return hasil; 
    } 
  
    // main method memanggil nomor method 
    // serta cetak hasil 
    public static void main(String[] args) 
    { 
        // panggil nomor method dengan 5 dan 7 sebagai input (dapat menggunkan scanner jika mau)
        int hasil = nomor(5, 9); 
        System.out.println("9 + 5 = " + hasil); 
    } 
}
