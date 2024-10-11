import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class TugasParkir19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0 , durasiTotal = 0;
        boolean biayaTetapDikenakan;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 

        do {
        System.out.println("Masukan jenis kendaraan ");
        System.out.println("ketik============================");
        System.out.println(" 1 untuk Mobil");
        System.out.println(" 2 untuk Motor");
        System.out.println(" 0 untuk menghitung total harga");
        System.out.println("=================================");
        System.out.print("jenis kendaraan =  ");
        jenis = sc.nextInt();

        if ( jenis==0) {
            
            break;
        } 
        System.out.print("Masukan durasi parkir dalam jam = ");
        durasi = sc.nextInt();
        System.out.println("---------------------------------");

        if ( durasi > 5) {
            total += 12500;
            biayaTetapDikenakan = true ;
        } else if (jenis== 1) {
            total += durasi * 3000;
        } else if (jenis== 2) {
            total += durasi * 2000;
        }
        durasiTotal += durasi;
        
        
        } while (true);
        

        System.out.println("==================STRUK PARKIR MALL JTI=========================");
        System.out.println("Total Parkir selama =  " + durasiTotal + " jam");
        System.out.println("TOTAL HARGA         =  " + currencyFormat.format(total));
        System.out.println("---------------------------------------------------------------");
        // Menampilkan informasi biaya tetap jika dikenakan
        if (biayaTetapDikenakan = true) {
            System.out.println("CATATAN = ");
            System.out.println("Anda dikenakan biaya tetap sebesar Rp 12.500 ");
            System.out.println("karena parkir lebih dari 5 jam.");
        }
        System.out.println("=========================TERIMAKASIH===========================   ");
       sc.close();

    }
}
