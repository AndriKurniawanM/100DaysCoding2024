public class Day33 {
    public static void main(String[] args) {
        int a = 2;
        double b = a;
        System.out.println(b);
        // otomatis upcasting
        double c = 4.5;
        int d;
        d = ((int) (c));
        System.out.println(d);
        //manual downcasting
        
        //contoh penenrapan
        int e,f;
        e = 3;
        f = 3;
        double g;
        g = ((double) (e*f))/2;
        System.out.println(g);
        
    }
}
