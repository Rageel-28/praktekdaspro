import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class tugas32gaji {
    public static void main
    (String[] args) {
        Scanner input = new Scanner(System.in);
        int hari , jamKerja;
        double upahPerjam, totalGaji, totalGajibonus, totalPajak, bonus = 0.1, pajak = 0.05;
        String namaKantor, namaPekerja;

        //Membuat objek NumberFormat untuk format mata uang
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));  // Format mata uang IDR

        // Masukan input dari user
        System.out.print("Masukkan Nama Kantor                    : ");
        namaKantor = input.nextLine();
        System.out.print("Masukkan Nama Pekerja                   : ");
        namaPekerja = input.nextLine();
        System.out.print("Masukkan Upah Per Jam                   : ");
        upahPerjam = input.nextDouble();
        System.out.print("Masukkan jumlah Jam Kerja Per Hari      : ");
        jamKerja = input.nextInt();
        System.out.print("Masukkan jumlah Hari Kerja Dalam 1 bulan: ");
        hari = input.nextInt();


        // Total gaji
        totalGaji = upahPerjam * (jamKerja * hari );
        // Total gaji dengan bonus
        totalGajibonus = totalGaji + (totalGaji * bonus);
        // Total pajak setelah bonus
        totalPajak = totalGajibonus - (totalGajibonus * pajak);

        // Output menggunakan NumberFormat
        System.out.println("---------------------------------------------------------------");
        System.out.println("------------Gaji Per Bulan Kantor = " + namaKantor + "-----------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Nama Pekerja              = " + namaPekerja);
        System.out.println("Gaji Pokok Rp             = " + currencyFormat.format(totalGaji));
        System.out.println("Gaji dengan Bonus Rp      = " + currencyFormat.format(totalGajibonus));
        System.out.println("Setelah dipotong pajak Rp = " + currencyFormat.format(totalPajak));
    }
}
