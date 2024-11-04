public class Day64 {
    public static void main(String[] args) {
        int [][] a = { {9, 10},{11, 12},{13, 14}};
        boolean cari = false;
        int baris, kolom;
        baris = 0;
        kolom = 0;
        //mencari index terbesar
        LabelA:
        for (baris = 0; baris < a.length; baris++) {
            for (kolom = 0; kolom < a[baris].length; kolom++) {
                if(a[baris][kolom] > 11) {
                    cari = true;
                    break LabelA; 
                    //untuk menghentikan pencarian
                }
                
            } 
            
        } if (cari) {
            System.out.println("Angka Terbesar Adalah : [" + baris + "," + kolom + "]");
            
        }
    }
}
