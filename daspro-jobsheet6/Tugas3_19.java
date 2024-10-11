import java.util.Scanner;
public class Tugas3_19{
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        double diskon = 0.0;
        int jmlBuku, jmlDiskon, total, hrgBuku = 20000;
        String jenisBuku;

        //input
        System.out.print("Masukan Jenis buku  = ");
        jenisBuku = sc19.nextLine();
        System.out.print("Masukan Jumlah buku =");
        jmlBuku = sc19.nextInt();

        //if
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.1;
            if (jmlBuku > 2) {
                diskon += 0.02 ;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if  (jmlBuku > 3) {
                diskon += 0.02;
            } else {
                 if (jmlBuku <= 3)
                diskon += 0.01;
            }
        } else {
            if (jmlBuku>3) {
                diskon = 0.05;

            }
        }
        double hargaTotal = hrgBuku*jmlBuku;
        double totalDiskon = hargaTotal* diskon;
        total = (int) (hrgBuku*jmlBuku-totalDiskon);

        System.out.println("Harga sebelum diskon = " + hargaTotal);
        System.out.println("Total Diskon         = " + totalDiskon);
        System.out.println("Total Bayar          = " + total );
    }
}