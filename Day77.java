import java.util.Scanner;
public class Day77 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan User: ");
    String nama = input.next ();
    if (nama.equals("Andri")) {
        System.out.print("Masukkan Password: ");
        String pass = input.next();
        if(pass.equals("admin123")){
            System.out.println("Selamat Datang");
        }
    }else{
        System.out.println("User atau Password salah, anda bukan Admin");
    }
}
}
