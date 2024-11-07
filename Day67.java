import java.util.*;
public class Day67 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Detik : ");
        int detik = z.nextInt();
        System.out.print("Masukkan konversi (jam/menit/hari) : ");
        String pilih = z.next();    
         switch (pilih) {
            case "menit":
                keMenit(detik);
                break;
            case "jam":
                keJam(detik);
                break;
            case "hari":
                keHari(detik);
                break;
            default:
                System.out.println("Jenis konversi tidak valid");
        } 
    }   
    public static void keJam(int jam) {
        int kJam = jam / 3600;
        System.out.println(kJam + " jam");
    }
    public static void keMenit(int menit) {
        int kMenit = menit / 60;
        System.out.println(kMenit + " menit");
    }
    public static void keHari(int hari) {
        int kMenit = hari / 86400;
        System.out.println(kMenit + " hari");
    }

}
