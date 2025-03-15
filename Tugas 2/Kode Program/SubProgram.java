import java.util.Scanner;

/* Contoh program yang mengandung prosedur dan fungsi */
/* prosedur/fungsi */
public class SubProgram {

    // Fungsi untuk mencari maksimum dua bilangan
    public static int maxab(int a, int b) {
        return (a >= b) ? a : b;  // Mengembalikan nilai maksimum
    }

    // Prosedur untuk menukar dua bilangan
    public static void tukar(int[] values) {
        int temp = values[0];  // Menyimpan nilai pertama
        values[0] = values[1];  // Menetapkan nilai pertama dengan nilai kedua
        values[1] = temp;  // Menetapkan nilai kedua dengan nilai sementara
        System.out.println("Ke dua bilangan setelah tukar: a = " + values[0] + " b = " + values[1]);
    }

    /*** Program Utama ***/
    public static void main(String[] args) {
        // Deklarasi variabel
        int a, b;
        Scanner masukan = new Scanner(System.in);

        // Program untuk membaca dua bilangan integer
        System.out.print("Maksimum dua bilangan\n");

        System.out.print("Ketikkan dua bilangan, pisahkan dg RETURN: \n");
        a = masukan.nextInt();
        b = masukan.nextInt();
        
        System.out.println("Ke dua bilangan : a = " + a + " b = " + b);

        // Menuliskan maksimum dua bilangan dengan memanggil fungsi maxab
        System.out.println("Maksimum = " + maxab(a, b));

        // Menukar kedua bilangan dengan 'prosedur'
        System.out.print("Tukar kedua bilangan...\n");

        // Menggunakan array untuk menukar nilai
        int[] values = {a, b};  // Membuat array untuk menyimpan nilai a dan b
        tukar(values);  // Memanggil prosedur tukar
    }
}
