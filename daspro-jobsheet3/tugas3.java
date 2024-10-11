import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        
        //format untuk mata uang
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale ("id","ID"));
        Scanner input = new Scanner(System.in);
        boolean  melebihi500kWh;
        int kWh, tarif = 1500;
        double totalHarga ;

        //input pengguanaan listrik dari pengguna
        System.out.print("masukan jumlah penggunaan listrik (kWh) : ");
        kWh = input.nextInt();

        // total tagihan
        totalHarga = kWh*tarif;

        //cek apakah melebihi 500 kwh
        melebihi500kWh = kWh > 500;

        //output hasil
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("--------------------------------TAGIHAN LISTRIK----------------------------------");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("total tagihan yang harus dibayar Rp       : " + currencyFormat.format (totalHarga));
        System.out.println("Apakah penggunaannya melebihi 500 kWh ?   : " + melebihi500kWh );


        


    }

    
}