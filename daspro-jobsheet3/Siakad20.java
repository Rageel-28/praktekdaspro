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



        //unrtuk masukan input
        System.out.print("Masukan nama :");
        nama = sc.nextLine();
        System.out.print("Masukan Nim:");
        nim = sc.nextLine();
        System.out.print("masukan kelas :");
        kelas = sc.nextLine();
        System.out.print("masukan nomor absen :");
        absen = sc.nextByte();
        //masukan input nilai
        System.out.print("masukan nilai kuis :");
        nilaiKuis = sc.nextDouble();
        System.out.print("masukan nilai tugas :");
        nilaiTugas = sc.nextDouble();
        System.out.print("masukan nilai uts :");
        nilaiUts = sc.nextDouble();
        System.out.print("masukan nilai Uas :");
        nilaiUas = sc.nextDouble();

        //nilai akhir
        nilaiAkhir = (nilaiKuis *0.2)+ (nilaiTugas*0.15) + (nilaiUts*0.3) + (nilaiUas*0.35);
        
        //output
        System.out.println("Nama = " + nama + "NIM = " + nim);
        System.out.println("Kelas = " + kelas +  " Absen = " + absen);
        System.out.println("Nilai Akhir = " + nilaiAkhir);


    }
}