import java.util.Scanner;

public class tugas2 {

    static Scanner input = new Scanner(System.in);

    // Fungsi untuk menginputkan data penjualan
    public static void inputDataPenjualan(int[][] penjualan) {
        System.out.println("Masukkan data penjualan untuk 5 menu selama 7 hari:");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Masukkan penjualan untuk menu: " + getMenu(i));
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data penjualan
    public static void tampilkanDataPenjualan(int[][] penjualan) {
        System.out.println("Rekap Penjualan Mingguan:");
        System.out.print("\tHari ke-1\tHari ke-2\tHari ke-3\tHari ke-4\tHari ke-5\tHari ke-6\tHari ke-7\n");
        
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(getMenu(i) + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan Menu yang memiliki penjualan tertinggi
    public static void tampilkanMenuTertinggi(int[][] penjualan) {
        int maxPenjualan = 0;
        String menuTertinggi = "";
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = getMenu(i);
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi adalah: " + menuTertinggi);
    }

    // Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu
    public static void tampilkanRataRataPenjualan(int[][] penjualan) {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / penjualan[i].length;
            System.out.println(getMenu(i) + ": " + rataRata);
        }
    }

    // Fungsi untuk mendapatkan nama menu berdasarkan index
    public static String getMenu(int index)  {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        return menu[index];
    }

        public static void main(String[] args) {
        // Array data penjualan: 5 menu dan 7 hari
        int[][] penjualan = new int[5][7];

        // Menginputkan data penjualan
        inputDataPenjualan(penjualan);

        // Menampilkan seluruh data penjualan
        tampilkanDataPenjualan(penjualan);

        // Menampilkan menu dengan penjualan tertinggi
        tampilkanMenuTertinggi(penjualan);

        // Menampilkan rata-rata penjualan untuk setiap menu
        tampilkanRataRataPenjualan(penjualan);
    }
}
