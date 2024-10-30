import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar",
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };

        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nama makanan yang ingin dicari
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = scanner.nextLine();

        // Mencari makanan menggunakan algoritma linear search
        boolean ditemukan = false;

        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (ditemukan) {
            System.out.println(makananDicari + " tersedia di menu.");
        } else {
            System.out.println(makananDicari + " tidak ada di menu.");
        }

    }
}