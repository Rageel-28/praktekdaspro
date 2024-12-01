import java.util.Scanner;

public class Fibonacci {

    static int hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;  // Pada bulan ke-1 dan ke-2, hanya ada 1 pasangan marmut
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2); // Fibonacci
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan (misalnya 12): ");
        int bulan = sc.nextInt();

        int hasil = hitungPasanganMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + hasil);
    }
}
