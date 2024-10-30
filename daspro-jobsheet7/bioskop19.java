
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

 
public class bioskop19 {

    public static void main(String[] args) {
        final int HARGA_TIKET = 50000;  // Harga per tiket
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah sesi dalam satu hari: ");
        int jumlahSesi = scanner.nextInt();

        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        double totalDiskon = 0;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 

        // Loop untuk setiap sesi
        for (int sesi = 1; sesi <= jumlahSesi; sesi++) {
            boolean inputValid = false;
            int tiketSesi = 0;

            // Meminta input jumlah tiket per sesi
            while (!inputValid) {
                System.out.print("Masukkan jumlah tiket yang terjual pada sesi ke-" + sesi + ": ");
                tiketSesi = scanner.nextInt();

                // Validasi input
                if (tiketSesi < 0) {
                    System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah yang benar.");
                } else {
                    inputValid = true;
                }
            }

            // Menambah tiket sesi ke total tiket terjual
            totalTiketTerjual += tiketSesi;

            // Menghitung harga sebelum diskon
            double penjualanSesi = tiketSesi * HARGA_TIKET;

            // Menghitung diskon per sesi
            double diskonSesi = 0;
            if (tiketSesi > 10) {
                diskonSesi = penjualanSesi * 0.15;  // Diskon 15%
            } else if (tiketSesi > 4) {
                diskonSesi = penjualanSesi * 0.10;  // Diskon 10%
            }

            // Mengurangi diskon dari penjualan sesi
            penjualanSesi -= diskonSesi;

            // Menambahkan penjualan sesi dan diskon ke total keseluruhan
            totalPenjualan += penjualanSesi;
            totalDiskon += diskonSesi;
        }

        // Menampilkan hasil perhitungan
        System.out.println("\n===== Laporan Penjualan Tiket =====");
        System.out.println("Total sesi                 : " + jumlahSesi);
        System.out.println("Total tiket yang terjual   : " + totalTiketTerjual);
        System.out.println("Total penjualan hari ini   : " + currencyFormat.format(totalPenjualan));
        System.out.println("Total diskon yang diberikan: " + currencyFormat.format(totalDiskon)); 
    }
}