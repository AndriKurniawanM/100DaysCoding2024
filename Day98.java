import java.util.Scanner;
public class Day98 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan nilai x: ");
        int x = z.nextInt();
        System.out.print("Masukkan nilai y: ");
        int y = z.nextInt();
        int k = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                if (k > 0) {
                    System.out.print(" + ");
                }
                System.out.print(i);
                k += i;
            }
        }
        System.out.println(" = " + k);
    }
}
