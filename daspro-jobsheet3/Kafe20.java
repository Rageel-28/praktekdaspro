
/**
 * Kafe20
 */
import java.util.Scanner ;

 public class Kafe20 {
    public static void main(String[] args) {
        //ini adalah scanner nya
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double nominalBayar, totalHarga, hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;

        //ini adalah input usernya
        System.out.print("Masukan keangotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukan jumlah pembelian kopi : ");
        jmlKopi = input.nextInt();
        System.out.print("Masukan jumlah pembelian teh : ");
        jmlTeh = input.nextInt();
        System.out.print("Masukan Jumlah Roti = ");
        jmlRoti = input.nextInt();

        //perhitungan
        totalHarga = (jmlKopi * hargaKopi) + ( jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        byte totalByte = (byte) totalHarga;
        //nominal bayar
        nominalBayar = totalByte - (diskon * totalHarga);
        int nominalInt = (int) nominalBayar;
        //output
        System.out.println("keanggotaan pelanggan " + keanggotaan );
        System.out.println("Item pembelian " + jmlKopi + "kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti " );
        System.out.println("Nominal Bayar (int) Rp = " + nominalInt);




        
    }

    
}

