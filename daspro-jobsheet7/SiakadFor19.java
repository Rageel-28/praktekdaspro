
import java.util.Scanner;
/**
 * SiakadFor19
 */
public class SiakadFor19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;


        for (int i = 1 ; i <= 10 ; i++) {
            System.out.print("Masukan nilai mahasiswa ke- " + i + " : ");
            nilai = sc.nextDouble();
            if ( nilai > tertinggi) {
                tertinggi=nilai;
            }
            if ( nilai < terendah) {
                terendah = nilai;
        }   
        if (nilai >=60 ) {
            lulus++;
        }else {
            tidakLulus++;
        }
        }

        System.out.println("Nilai tertinggi : " + tertinggi );
        System.out.println("nilai terendah :" + terendah );
        System.out.println("jumlah mahasiswa lulus :" + lulus );
        System.out.println("jumlah mahasiswa tidak lulus :" + tidakLulus );
    }
}