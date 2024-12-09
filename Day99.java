import java.util.Scanner;
public class Day99 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        double a,b,d;
        System.out.print("Masukkan angka 1: ");
                a = z.nextDouble();
        System.out.print("Masukkan angka 2: ");
                b = z.nextDouble();
                d = 0;
        System.out.print("Masukkan operator (Penjumlahan (+) , Perkalian (*) ,Pembagian (/) ,Pengurangan (-) ,Sisa Bagi (%)): ");
        char c = z.next().charAt(0);
        switch(c){
            case '+':
                d = a+b;
                 if (a%1 == 0 && b%1==0 && d % 1 == 0) {
                    // Jika ketiga bilangan bulat
                    System.out.println((int)a + " + " +(int) b + " = " + (int) d);
                } else if (a%1 == 0 && b%1==0 && d % 1 != 0) {
                    // Jika hasil bilangan desimal tapi kedua angka bulat
                    System.out.println((int)a + " + " +(int) b + " = " + d);
                } else if (a%1 != 0 && b%1!=0 && d % 1 == 0) {
                    // Jika hasil bilangan bulat tapi kedua angka desimal
                    System.out.println(a + " + " + b + " = " + (int)d);
                } else if (a%1 != 0 && b%1==0 && d % 1 == 0) {
                    // Jika input 1 desimal tapi kedua angka bulat
                    System.out.println(a + " + " +(int) b + " = " +(int) d);
                } else if (a%1 == 0 && b%1!=0 && d % 1 == 0) {
                    // Jika input 2 desimal tapi kedua angka bulat
                    System.out.println((int)a + " + " + b + " = " +(int) d);
                } else{
                    // Jika semuanya bilangan desimal
                    System.out.println(a + " + " + b + " = " + d);
                } 
                break;
            case '*':
                d = a*b;
                 if (a%1 == 0 && b%1==0 && d % 1 == 0) {
                    // Jika ketiga bilangan bulat
                    System.out.println((int)a + " * " +(int) b + " = " + (int) d);
                } else if (a%1 == 0 && b%1==0 && d % 1 != 0) {
                    // Jika hasil bilangan desimal tapi kedua angka bulat
                    System.out.println((int)a + " * " +(int) b + " = " + d);
                } else if (a%1 != 0 && b%1!=0 && d % 1 == 0) {
                    // Jika hasil bilangan bulat tapi kedua angka desimal
                    System.out.println(a + " * " + b + " = " + (int)d);
                } else if (a%1 != 0 && b%1==0 && d % 1 == 0) {
                    // Jika input 1 desimal tapi kedua angka bulat
                    System.out.println(a + " * " +(int) b + " = " +(int) d);
                } else if (a%1 == 0 && b%1!=0 && d % 1 == 0) {
                    // Jika input 2 desimal tapi kedua angka bulat
                    System.out.println((int)a + " * " + b + " = " +(int) d);
                } else{
                    // Jika semuanya bilangan desimal
                    System.out.println(a + " * " + b + " = " + d);
                } 
                break;
            case '/':
                d = a/b;
                if (a%1 == 0 && b%1==0 && d % 1 == 0) {
                    // Jika ketiga bilangan bulat
                    System.out.println((int)a + " / " +(int) b + " = " + (int) d);
                } else if (a%1 == 0 && b%1==0 && d % 1 != 0) {
                    // Jika hasil bilangan desimal tapi kedua angka bulat
                    System.out.println((int)a + " / " +(int) b + " = " + d);
                } else if (a%1 != 0 && b%1!=0 && d % 1 == 0) {
                    // Jika hasil bilangan bulat tapi kedua angka desimal
                    System.out.println(a + " / " + b + " = " + (int)d);
                } else if (a%1 != 0 && b%1==0 && d % 1 == 0) {
                    // Jika input 1 desimal tapi kedua angka bulat
                    System.out.println(a + " / " +(int) b + " = " +(int) d);
                } else if (a%1 == 0 && b%1!=0 && d % 1 == 0) {
                    // Jika input 2 desimal tapi kedua angka bulat
                    System.out.println((int)a + " / " + b + " = " +(int) d);
                } else{
                    // Jika semuanya bilangan desimal
                    System.out.println(a + " / " + b + " = " + d);
                } 
                break;
            case '%':
                d = a%b;
                if (a%1 == 0 && b%1==0 && d % 1 == 0) {
                    // Jika ketiga bilangan bulat
                    System.out.println((int)a + " % " +(int) b + " = " + (int) d);
                } else if (a%1 == 0 && b%1==0 && d % 1 != 0) {
                    // Jika hasil bilangan desimal tapi kedua angka bulat
                    System.out.println((int)a + " % " +(int) b + " = " + d);
                } else if (a%1 != 0 && b%1!=0 && d % 1 == 0) {
                    // Jika hasil bilangan bulat tapi kedua angka desimal
                    System.out.println(a + " % " + b + " = " + (int)d);
                } else if (a%1 != 0 && b%1==0 && d % 1 == 0) {
                    // Jika input 1 desimal tapi kedua angka bulat
                    System.out.println(a + " % " +(int) b + " = " +(int) d);
                } else if (a%1 == 0 && b%1!=0 && d % 1 == 0) {
                    // Jika input 2 desimal tapi kedua angka bulat
                    System.out.println((int)a + " % " + b + " = " +(int) d);
                } else{
                    // Jika semuanya bilangan desimal
                    System.out.println(a + " % " + b + " = " + d);
                } 
                break;
            case '-':
                d = a-b;
                 if (a%1 == 0 && b%1==0 && d % 1 == 0) {
                    // Jika ketiga bilangan bulat
                    System.out.println((int)a + " - " +(int) b + " = " + (int) d);
                } else if (a%1 == 0 && b%1==0 && d % 1 != 0) {
                    // Jika hasil bilangan desimal tapi kedua angka bulat
                    System.out.println((int)a + " - " +(int) b + " = " + d);
                } else if (a%1 != 0 && b%1!=0 && d % 1 == 0) {
                    // Jika hasil bilangan bulat tapi kedua angka desimal
                    System.out.println(a + " - " + b + " = " + (int)d);
                } else if (a%1 != 0 && b%1==0 && d % 1 == 0) {
                    // Jika input 1 desimal tapi kedua angka bulat
                    System.out.println(a + " - " +(int) b + " = " +(int) d);
                } else if (a%1 == 0 && b%1!=0 && d % 1 == 0) {
                    // Jika input 2 desimal tapi kedua angka bulat
                    System.out.println((int)a + " - " + b + " = " +(int) d);
                } else{
                    // Jika semuanya bilangan desimal
                    System.out.println(a + " - " + b + " = " + d);
                } 
                break;
            default:
                System.out.println("Operator tidak valid. Gunakan salah satu dari +, -, *, / atau %");
                break;
        } 
    }
    
}
