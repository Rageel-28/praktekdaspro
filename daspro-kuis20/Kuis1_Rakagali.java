/* input = biaya suku cadang, biaya jasa perbaikan
 * output = total biaya sebelum pajak,setelah potongan harga suku cadang, 
 * pajak,total biaya yang harus dibayarkan setelah potongan dan pajak
 * algoritma = 1. import java util scanner 
 * 2. impor java text number format
 * 3.import java util local * 
 * 4. sesuaikan tipe data
 * 5.input biaya suku cadang dan perbaikan dari user 
 * 6. hitung total biaya perbaikan sebelum pajak
 * 7. TAMPILKAN outuput Total biaya perbaikan sebelum pajak ,
 * Potongan harga suku cadang, pajak, Total Yaang harus dibayar
 */


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Kuis1_Rakagali
 */
public class Kuis1_Rakagali {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // tipe data variabel
        int biayaPerbaikan20 , biayaSukucadang20, biayaPerbaikansp20;
        double pajakPerbaikan20 = 0.07, diskonHargasc20 = 0.05, potonganSukucadang20, totalSetelahdisc20, totalPajak20, totalBayar20;

        //Membuat objek NumberFormat untuk format mata uang
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));  // Format mata uang IDR

        // input user
        System.out.println("     ----------------------------------------------------      ");
        System.out.println("---------------------SELAMAT DATANG ---------------------------");
        System.out.println("     ----------------------------------------------------      ");
        System.out.print("Masukan biaya jasa perbaikan    =  ");
        biayaPerbaikan20 = input.nextInt();
        System.out.print("Masukan harga biaya suku cadang =  ");
        biayaSukucadang20 = input.nextInt();

        //perhitungan total biaya perbaikan sebelum pajak
        biayaPerbaikansp20 = biayaSukucadang20 + biayaPerbaikan20 ;
        //potongan harga suku cadang
        potonganSukucadang20 = biayaSukucadang20 * diskonHargasc20 ;
        // setelah pootongan harga suku cadang
        totalSetelahdisc20 = biayaPerbaikan20 + (biayaSukucadang20 - potonganSukucadang20) ;
        //total pajak yang dikenakan pada total biaya perbaikan setelah potongan
        totalPajak20 = totalSetelahdisc20 * pajakPerbaikan20 ;
        //total yNG Hrus dibayar
        totalBayar20 = totalSetelahdisc20 - totalPajak20 ;
        System.out.println("     ----------------------------------------------------      ");
        System.out.println("---------------------STRUK BENGKEL OTO-------------------------");
        System.out.println("     ----------------------------------------------------      ");
        System.out.println(" Total biaya perbaikan sebelum pajak   = " + currencyFormat.format(biayaPerbaikansp20));
        System.out.println(" Potongan harga suku cadang sebesar    = " + currencyFormat.format(potonganSukucadang20));
        System.out.println(" Jumlah Pajak Sebesar                  = " + currencyFormat.format(totalPajak20));
        System.out.println(" Total Yaang harus dibayar             = " + currencyFormat.format(totalBayar20));


    }
}