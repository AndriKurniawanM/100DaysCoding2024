import java.util.Scanner;
public class Day90{
    public static void main(String[] args) {
        Scanner z = new Scanner (System.in);
        System.out.print("Masukkan modal awal: ");
        double modal,keuntungan;
        int tahun;      
        modal = z.nextDouble();
        System.out.print("Lama Investasi: ");
        tahun = z.nextInt();
        for (int i = 1; i <= tahun; i++) {
            keuntungan = modal *0.05;
            modal += keuntungan;
            System.out.println("Tahun ke-" + i + " Rp " + modal);            
        }
        System.out.println("Total Investasi Setelah : " + tahun + " Tahun = Rp " + modal);
    }
}
