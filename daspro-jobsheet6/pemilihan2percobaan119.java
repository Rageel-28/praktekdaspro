import java.util.Scanner;

public class pemilihan2percobaan119 {

    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = sc19.nextInt();

        if (tahun % 4 == 0) {
            // Jika tahun habis dibagi 4
            if (tahun % 100 == 0) {
                // Jika tahun habis dibagi 100
                if (tahun % 400 == 0) {
                    // Jika tahun juga habis dibagi 400, ini tahun kabisat
                    System.out.println("Tahun kabisat");
                } else {
                    // Jika tahun habis dibagi 100 tetapi tidak habis dibagi 400, bukan tahun kabisat
                    System.out.println("Bukan tahun kabisat");
                }
            } else {
                // Jika tahun habis dibagi 4 tetapi tidak habis dibagi 100, ini tahun kabisat
                System.out.println("Tahun kabisat");
            }
        } else {
            // Jika tidak habis dibagi 4, bukan tahun kabisat
            System.out.println("Bukan tahun kabisat");
        }

        
    }
}
