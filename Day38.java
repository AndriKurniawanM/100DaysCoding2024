import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int a,b,c;
        System.out.print("Masukkan angka 1 : ");
        a = z.nextInt();
        System.out.print("Masukkan angka 2 : ");
        b = z.nextInt();
        c = a*b;
        System.out.println(a + " + " + b + " = " + c);
        System.out.println("__________________");
        int d,e,f;
        System.out.print("Masukkan angka 1 : ");
        d = z.nextInt();
        System.out.print("Masukkan angka 2 : ");
        e = z.nextInt();
        f = d/e;
        System.out.println(d + " - " + e + " = " + f);
    }
}
