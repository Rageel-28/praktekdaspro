import java.util.Scanner;
public class ArrayRataNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah mahasiswa = ");
        int jumlahMahasiswa = sc.nextInt();

        int [] nilaiMhs= new int[jumlahMahasiswa];
        double totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

       

        for (int i = 0 ;i<nilaiMhs.length;i++  ) {
            System.out.print("Masukan nilai mahasiswa ke - "+(i+1) + " :");
            nilaiMhs [i] = sc.nextInt() ;
        }
        
        for (int nilai : nilaiMhs) {
            if (nilai >70) {
                totalLulus += nilai;
                jumlahLulus++;
            } else {
                totalTidakLulus += nilai;
                jumlahTidakLulus++;
            }
        }
        double rataLulus = (jumlahLulus > 0) ? totalLulus /jumlahLulus : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? totalTidakLulus / jumlahTidakLulus : 0;
        
        // Menampilkan hasil
        System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rataLulus);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rataTidakLulus);
        
    }
}