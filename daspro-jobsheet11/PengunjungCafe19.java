public class PengunjungCafe19 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung: ");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }
public static void main(String[] args) {
    daftarPengunjung("Aldi", "Budi", "Citra");
}
    
}