import java.util.Scanner;

/**
 * PemilihanHari20
 */
public class PemilihanHariDenganIf20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input bilangan bulat = ");
        int number = sc.nextInt();

        if (number >= 1 && number <= 5) {
            System.out.println("weekend");
        } else if (number == 6 || number == 7) {
            System.out.println("Weekeend");
        } else {
            System.out.println("Invalid Number");
        }
     }
        
        
}
