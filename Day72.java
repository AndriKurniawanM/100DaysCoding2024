public class Day72 {
  public static void main(String[] args) {
    int jumlah = hasil(10);
    System.out.println(jumlah);
  }
  public static int hasil(int k) {
    if (k > 0) {
      return k + hasil(k - 1);
    } else {
      return 0;
    }
  }
}
