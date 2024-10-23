import java.util.Scanner;
public class Day52 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        int a = z.nextInt();
        String b = (a %2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angkanya itu " + b);
    }
}
