/*memasukkan banyaknya nilai mahasiswa yang akan diinput,
- memasukkan setiap nilai mahasiswa,

- menghitung nilai rata-rata,

- menampilkan nilai tertinggi dan nilai terendah, serta
- menampilkan semua nilai yang telah dimasukkan */

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah mahasiswa = ");
        int jumlahMahasiswa = sc.nextInt();
        
        int [] nilaiMhs= new int[jumlahMahasiswa];
        int total = 0;

        for (int i = 0; i<nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke - "+ (i+1) + "  :");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        int nilaiTertinggi = nilaiMhs [0];
        int nilaiTerendah = nilaiMhs [0];

        for (int i = 1; i< nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi=nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah=nilaiMhs[i];
            }
        }

        double rataRata = (double) total / jumlahMahasiswa;

        
        System.out.println("--------------------------------------");
        System.out.println("Rata-rata nilai = " + rataRata);
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai terendah  = " + nilaiTerendah);
        System.out.println("--------------------------------------");
        System.out.println("Nilai yang telah dimasukan");
        for (int i = 0; i< nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke -" + (i + 1) + ":" + nilaiMhs [i]);
        }




    }   
}