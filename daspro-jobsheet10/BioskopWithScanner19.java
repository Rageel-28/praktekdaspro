import java.util.Scanner;
public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris,kolom, pilihan ;
        String nama;
        String [][] penonton = new String [4][2];
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 :
                    System.out.print("Masukan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukan duduk di baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukan duduk di kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        penonton[baris - 1][kolom - 1] = nama; 
                        System.out.println("Data penonton berhasil disimpan!");
                    } else {
                        System.out.println("Posisi baris atau kolom tidak valid.");
                    }
                    break;
                case 2 :
                    System.out.println("Daftar penonton : ");
                    for (int i= 0 ; i < penonton.length; i++) {
                        for (int j= 0 ; j < penonton[i].length; j++) {
                            String penontonName = (penonton[i][j] !=null) ? penonton [i][j] : " - ";
                            System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penontonName);
                            
                        }
                    }
                    break;
                case 3 : 
                    System.out.println("Keluar dari program...");
                    return; 

             default:
                    System.out.println("Pilihan tidak valid. Masukkan angka 1, 2, atau 3.");
                    break;

            }
            
            
        }
    }
}