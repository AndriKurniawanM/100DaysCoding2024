import java.util.*;
public class Day51 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int bulan,tanggal;
        System.out.print("Masukkan Bulan  \t:" );
        bulan = z.nextInt();
        System.out.print("Masukkan Tanggal\t:" );
        tanggal = z.nextInt();
        switch (bulan) {
            case 1 -> {
            if (tanggal >= 1 && tanggal <= 19) {
                System.out.println("Zodiak Anda adalah Capricon");
            }else if (tanggal > 19 && tanggal <= 31) {
                System.out.println("Zodiak Anda adalah Aquarius");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }
            case 2 -> {
            if (tanggal >= 1 && tanggal <= 18) {
                System.out.println("Zodiak Anda adalah Aquarius");
            }else if (tanggal > 19 && tanggal <= 29) {
                System.out.println("Zodiak Anda adalah Pisces ");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }
            case 3 -> {
            if (tanggal >= 1 && tanggal <= 20) {
                System.out.println("Zodiak Anda adalah Pisces");
            }else if (tanggal > 20 && tanggal <= 31) {
                System.out.println("Zodiak Anda adalah Aries ");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }
            case 4 -> {
            if (tanggal >= 1 && tanggal <= 19) {
                System.out.println("Zodiak Anda adalah Aries");
            }else if (tanggal > 19 && tanggal <= 30) {
                System.out.println("Zodiak Anda adalah Taurus");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }
            case 5 -> {
            if (tanggal >= 1 && tanggal <= 20) {
                System.out.println("Zodiak Anda adalah Taurus");
            }else if (tanggal > 20 && tanggal <= 31) {
                System.out.println("Zodiak Anda adalah Gemini");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }
            case 6 -> {
            if (tanggal >= 1 && tanggal <= 20) {
                System.out.println("Zodiak Anda adalah Gemini");
            }else if (tanggal > 20 && tanggal <= 30) {
                System.out.println("Zodiak Anda adalah Cancer");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }
            case 7 -> {
            if (tanggal >= 1 && tanggal <= 22) {
                System.out.println("Zodiak Anda adalah Cancer");
            }else if (tanggal > 22 && tanggal <= 31) {
                System.out.println("Zodiak Anda adalah Leo");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }
            case 8 -> {
            if (tanggal >= 1 && tanggal <= 22) {
                System.out.println("Zodiak Anda adalah Leo");
            }else if (tanggal > 22 && tanggal <= 31) {
                System.out.println("Zodiak Anda adalah Virgo");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }
            case 9 -> {
            if (tanggal >= 1 && tanggal <= 22) {
                System.out.println("Zodiak Anda adalah Virgo");
            }else if (tanggal > 22 && tanggal <= 30) {
                System.out.println("Zodiak Anda adalah Libra");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }
            case 10 -> {
            if (tanggal >= 1 && tanggal <= 22) {
                System.out.println("Zodiak Anda adalah Libra");
            }else if (tanggal > 23 && tanggal <= 31) {
                System.out.println("Zodiak Anda adalah Scorpio");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }
            case 11 -> {
            if (tanggal >= 1 && tanggal <= 21) {
                System.out.println("Zodiak Anda adalah Scorpio");
            }else if (tanggal > 21 && tanggal <= 30) {
                System.out.println("Zodiak Anda adalah Sagittarius");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }
            case 12 -> {
            if (tanggal >= 1 && tanggal <= 21) {
                System.out.println("Zodiak Anda adalah Sagittarius");
            }else if (tanggal > 21 && tanggal <= 31) {
                System.out.println("Zodiak Anda adalah Capricon ");
            }else{ System.out.println("Tanggal tidak valid");
            } break;
        }    
        default -> System.out.println("Bulan tidak valid");
    } if (tanggal > 31) { System.out.println("Tanggal tidak valid");
    } 
}
}   
