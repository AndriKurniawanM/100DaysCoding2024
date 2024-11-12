public class Day72 {
  public static void main(String[] args) {
    int hasil = hasil(10);
    System.out.println(hasil);
  }
  public static int hasil(int k) {
    if (k > 0) {
      return k + hasil(k - 1);
    } else {
      return 0;
    }
  }
}
