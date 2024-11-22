import java.util.Scanner;

public class kubus19 {
    // Perbaikan pada perhitungan luas permukaan
    static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi; // Rumus luas permukaan kubus
    }
    
    // Perbaikan pada perhitungan volume
    static int hitungVolume(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi; // Rumus volume kubus
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        // Input dari pengguna
        System.out.print("Masukkan panjang sisi kubus: ");
        p = input.nextInt();  // Menggunakan panjang sisi yang sama untuk p dan l
        System.out.print("Masukkan lebar sisi kubus: ");
        l = input.nextInt();  // Bisa diabaikan jika p dan l dianggap sama
        System.out.print("Masukkan tinggi kubus: ");
        t = input.nextInt();

        // Hitung luas permukaan dan volume
        L = hitungLuasPermukaan(p);
        System.out.println("Luas permukaan kubus adalah: " + L);
        vol = hitungVolume(p, l, t);
        System.out.println("Volume kubus adalah: " + vol);
    }
}
