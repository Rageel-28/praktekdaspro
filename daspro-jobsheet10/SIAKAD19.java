import java.util.Scanner;
public class SIAKAD19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.print("Masukan jumlah mahasiswa   : ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukan Jumlah Mata Kuliah : ");
        int jumlahMatkul = sc.nextInt();
        int [][] nilai = new int [jumlahMahasiswa][jumlahMatkul];
        

        for (int i = 0 ; i < nilai.length; i++) {
            System.out.println("input nilai mahasiswa ke -" +(i+1));
            int totalPersiswa = 0;
            for (int j = 0; j< nilai[i].length;j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai [i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPersiswa/jumlahMatkul);
        }

        System.out.println("=========================");
        System.out.println("Rata rata nilai setiap mata kuliah:");

            for (int j=0; j<jumlahMatkul; j++) {
                double totalPerMatkul = 0;
                for (int i = 0; i < jumlahMahasiswa; i++) {
                    totalPerMatkul+= nilai [i][j];

                }
                System.out.println("Mata kuliah " +(j+1) + " : " + totalPerMatkul/jumlahMahasiswa);
            }

    }
}