import java.util.Scanner;

public class Pemilihan2Percobaan3_19 {
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;
        System.out.print(" Masukan kategori = ");
        kategori= sc19.nextLine();
        System.out.print(" Masukan besarnya penghasilan = ");
        penghasilan = sc19.nextInt();

        //if
        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan<= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak*penghasilan));
            System.out.print("Penghasilan bersih = " + gajiBersih);
        } else if (kategori.equals("Pebisnis")) {
            if (penghasilan<=25000000)
                pajak = 0.15;
            else if (penghasilan<=35000000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) ( penghasilan - (pajak*penghasilan));
            System.out.print("Penghasilan Bersih = " + gajiBersih);
        }else 
            System.out.println("kategori yang anda masukan salah");
    }
}

