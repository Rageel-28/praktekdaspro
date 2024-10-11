/**
 * Siakad20
 */
import java.util.Scanner;
public class Siakad20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;



        //unrtuk masukan 
        System.out.println("    --------------------------------------------------     ");
        System.out.println("-------------SELAMAT DATANG DI KALKULATOR NILAI---------------      ");
        System.out.println("    --------------------------------------------------     ");
        System.out.print("Masukan nama            :");
        nama = sc.nextLine();
        System.out.print("Masukan Nim             :");
        nim = sc.nextLine();
        System.out.print("masukan kelas           :");
        kelas = sc.nextLine();
        System.out.print("masukan nomor absen     :");
        absen = sc.nextByte();
        //masukan input nilai
        System.out.print("masukan nilai kuis      :");
        nilaiKuis = sc.nextDouble();
        System.out.print("masukan nilai tugas     :");
        nilaiTugas = sc.nextDouble();
        System.out.print("masukan nilai uts       :");
        nilaiUts = sc.nextDouble();
        System.out.print("masukan nilai Uas       :");
        nilaiUas = sc.nextDouble();

        //nilai akhir
        nilaiAkhir = (nilaiKuis *0.2)+ (nilaiTugas*0.15) + (nilaiUts*0.3) + (nilaiUas*0.35);

    
        //output
        System.out.println("    --------------------------------------------------     ");
        System.out.println("--------------BERIKUT ADALAH DATA SISWA--------------------      ");
        System.out.println("    --------------------------------------------------     ");

        System.out.println("Nama         = " + nama  +         " NIM    = " + nim);
        System.out.println("Kelas        = " + kelas +         " Absen  = " + absen);
        System.out.println("Nilai Akhir  = " + nilaiAkhir);
        if ( nilaiAkhir > 80 && nilaiAkhir<= 100){
            System.out.println("Nilai akhir huruf      = A ");
            System.out.println("kualifikasi            = sangat baik");
        } else if ( nilaiAkhir > 73 && nilaiAkhir<= 80){
            System.out.println("Nilai akhir huruf      = B+ ");
            System.out.println("kualifikasi            = lebih dari baik");
        } else if ( nilaiAkhir > 65 && nilaiAkhir<= 73){
            System.out.println("Nilai akhir huruf      = B ");
            System.out.println("kualifikasi            = Baik");
        } else if ( nilaiAkhir > 60 && nilaiAkhir<= 65){
            System.out.println("Nilai akhir huruf      = C+ ");
            System.out.println("kualifikasi            = Lebih dari cukup");
        } else if ( nilaiAkhir > 50 && nilaiAkhir<= 60){
            System.out.println("Nilai akhir huruf      = C ");
            System.out.println("kualifikasi            = Cukup");
        } else if ( nilaiAkhir > 39 && nilaiAkhir<= 50){
            System.out.println("Nilai akhir huruf      = D ");
            System.out.println("kualifikasi            = Kurang");
        } else if ( nilaiAkhir<= 39){
            System.out.println("Nilai akhir huruf      = E ");
            System.out.println("kualifikasi            = Gagal ");
        }
    }
}