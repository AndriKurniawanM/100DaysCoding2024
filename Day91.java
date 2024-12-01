import java.util.Scanner;
public class Day91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan angka: ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("You and I, end");
                break;
            }
        }
        sc.close();
    }
}
