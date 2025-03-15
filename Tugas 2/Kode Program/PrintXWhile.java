import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan WHILE */
public class PrintXWhile {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        Sum = 0; /* Inisialisasi */
        
        // Meminta input pertama dari pengguna
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        
        // Proses selama nilai x tidak sama dengan 999
        while (x != 999) { /* Kondisi berhenti */
            Sum = Sum + x; /* Proses penjumlahan */
            
            // Meminta input lagi
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt(); /* Next Elmt */
        }
        
        // Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan = " + Sum); /* Terminasi */
    }
}
