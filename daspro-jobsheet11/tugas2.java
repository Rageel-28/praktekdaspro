import java.util.Scanner;

public class tugas2{
    // Fungsi untuk menginputkan nilai tugas
    public static void inputNilaiTugas(int jumlahMahasiswa, int jumlahTugas, int[][] nilai) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas " + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan nilai tugas
    public static void tampilkanNilaiTugas(int jumlahMahasiswa, int jumlahTugas, int[][] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan rata-rata nilai per mahasiswa
    public static void tampilkanRataRataMahasiswa(int jumlahMahasiswa, int jumlahTugas, int[][] nilai) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int total = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                total += nilai[i][j];
            }
            double rataRata = (double) total / jumlahTugas;
            System.out.println("Rata-rata Mahasiswa " + (i + 1) + ": " + rataRata);
        }
    }

    // Fungsi untuk menampilkan tugas dengan nilai tertinggi
    public static void tampilkanTugasTertinggi(int jumlahMahasiswa, int jumlahTugas, int[][] nilai) {
        int[] totalTugas = new int[jumlahTugas];

        // Menjumlahkan nilai tugas per tugas
        for (int j = 0; j < jumlahTugas; j++) {
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalTugas[j] += nilai[i][j];
            }
        }

        // Menemukan tugas dengan total nilai tertinggi
        int tugasTertinggi = 0;
        int maxTotal = totalTugas[0];
        for (int j = 1; j < jumlahTugas; j++) {
            if (totalTugas[j] > maxTotal) {
                maxTotal = totalTugas[j];
                tugasTertinggi = j;
            }
        }
        System.out.println("\nTugas dengan nilai tertinggi adalah Tugas " + (tugasTertinggi + 1) + " dengan total nilai: " + maxTotal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah mahasiswa dan jumlah tugas
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = input.nextInt();

        // Membuat array untuk menampung nilai mahasiswa
        int[][] nilai = new int[jumlahMahasiswa][jumlahTugas];

        // Menginputkan nilai tugas
        inputNilaiTugas(jumlahMahasiswa, jumlahTugas, nilai);

        // Menampilkan semua nilai tugas
        tampilkanNilaiTugas(jumlahMahasiswa, jumlahTugas, nilai);

        // Menampilkan rata-rata nilai per mahasiswa
        tampilkanRataRataMahasiswa(jumlahMahasiswa, jumlahTugas, nilai);

        // Menampilkan tugas dengan nilai tertinggi
        tampilkanTugasTertinggi(jumlahMahasiswa, jumlahTugas, nilai);
    }
}