import java.util.*;
public class Day39 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int a,b,c;
        System.out.print("Masukkan angka 1 : ");
        a = z.nextInt();
        System.out.print("Masukkan angka 2 : ");
        b = z.nextInt();
        c = a%b;
        System.out.println(a + " % " + b + " = " + c);
    }
}
