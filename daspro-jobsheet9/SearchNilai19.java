import java.util.Scanner;

public class SearchNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan banyaknya nilai yang akan diinput =");
        int banyakNilai = sc.nextInt();

        int [] arrNilai = new int [banyakNilai];

        for (int i = 0 ;i<arrNilai.length;i++  ) {
            System.out.print("Masukan nilai mahasiswa ke - "+(i+1) + " :");
            arrNilai [i] = sc.nextInt() ;
        }

        System.out.println("Masukan nilai yang ingin dicari : ");
        int key = sc.nextInt();
        int hasil = -1 ;

        for (int i=0; i<arrNilai.length; i++) {
            if (key ==arrNilai [i]) {
                hasil = i; 
                break ;
            }
        }
         if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke - " + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
        }


    }
}