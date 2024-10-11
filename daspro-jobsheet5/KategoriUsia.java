  import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia;
        System.out.println("   -------------------------------------------------   ");
        System.out.println("-----------Apakah kategori usia Anda? -----------------");
        System.out.println("   -------------------------------------------------   ");
        System.out.print("Masukan Usia Anda      = ");
        usia = sc.nextInt();

        if (usia < 0 ){
            System.out.println("------------------------------------------------------");
            System.out.println("Maaf input anda tidak valid");
        return;
    }
        String kategori;
        if (usia>= 0 && usia <=12){
            kategori = "Anak";
        } else if ( usia >= 13 && usia <=19) {
            kategori = "Remaja";
        } else if ( usia >= 20 && usia <=64) {
            kategori= "Dewasa";
        } else  {
            kategori ="Lansia";

        }
        System.out.println("Anda termasuk dalam kategori = " + kategori);

    
        
        


    }
}