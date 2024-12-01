import java.util.Scanner;

public class PenjumlahanRekursif {

    static int hitungPenjumlahan(int f) {
        if (f == 1) {
            return 1;
        } else {
            return f + hitungPenjumlahan(f - 1);
        }
    }

    static void tampilkanDeretPenjumlahan(int f) {
        if (f == 1) {
            System.out.print("1");
        } else {
            tampilkanDeretPenjumlahan(f - 1);
            System.out.print(" + " + f);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        System.out.print("Deret penjumlahan: ");
        tampilkanDeretPenjumlahan(f);
        System.out.println();

        int hasil = hitungPenjumlahan(f);
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}
