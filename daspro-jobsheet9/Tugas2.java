import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah pesanan :");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String [jumlahPesanan];
        double[] hargaPesanan = new double [jumlahPesanan];
        double totalBiaya =0;

        for (int i = 0; i< jumlahPesanan ; i++){
            System.out.print("Masukan nama pesanan ke-" + (i+1) + " :");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukan harga pesan ke- " + (i+1) + " :");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();

            totalBiaya += hargaPesanan[i];

        }

        System.out.println("Daftar pesanan :");
        for ( int i = 0; i <jumlahPesanan; i++){
            System.out.println(namaPesanan[i] + " - Harga : " + hargaPesanan[i]);
        }
        System.out.println("TOtal biaya : " + totalBiaya);


    }
}