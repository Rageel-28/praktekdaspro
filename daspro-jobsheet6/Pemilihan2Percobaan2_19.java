import java.util.Scanner;

public class Pemilihan2Percobaan2_19 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        double diskon = 0, harga = 0;
        double totalBayar = 0;
        final double potonganQris = 1000;

        System.out.println("...");
        System.out.println("--------------------------------");
        System.out.println("========MENU KAFE JTI========");
        System.out.println("--------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice tea)");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan Angka Menu Pilihan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = sc.next();
        System.out.print("Jenis Pembayaran: ");
        String jenisPembayaran = sc.next();
        System.out.println("---------------------------------------");

        // Pengecekan member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl: " + harga);

            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea: " + harga);

            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling: " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            // Hitung total bayar setelah diskon jika member
            totalBayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon: " + totalBayar);
        }

        // Kondisi jika bukan member
        else if (member.equalsIgnoreCase("n")) {
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl: " + harga);

            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea: " + harga);

            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling: " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            // Total bayar langsung sama dengan harga jika bukan member
            totalBayar = harga;
            System.out.println("Total bayar: " + totalBayar);
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        System.out.println("---------------------------------------");

        // Penerapan potongan QRIS
        if (jenisPembayaran.equalsIgnoreCase("Qris")) {
            totalBayar -= potonganQris;
            System.out.println("Potongan QRIS sebesar Rp. 1.000 diterapkan.");
        }

        // Cetak total bayar akhir
        System.out.println("Total bayar setelah diskon dan potongan: " + totalBayar);
        System.out.println("---------------------------------------");
    }
}
