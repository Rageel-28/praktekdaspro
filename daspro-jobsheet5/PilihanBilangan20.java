import java.util.Scanner;

/**
 * PilihanBilangan20
 */
public class PilihanBilangan20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan sebuah angka = ");
        int angka = sc.nextInt();

        System.out.println("Angka " + angka + " termasuk bilangan " + (angka % 2 == 0 ? "genap" : "ganjil"));


       
            
        }
    }
