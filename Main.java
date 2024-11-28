import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Log-in
        boolean loginSuccess = false;
        while (!loginSuccess) {
            System.out.println("Log in");
            System.out.println("+-----------------------------------------------------+");
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            System.out.print("Captcha (Masukkan CRIA3): ");
            String captcha = scanner.nextLine();

            // Validasi login menggunakan method String
            // - `equalsIgnoreCase` membandingkan string tanpa memperhatikan huruf besar/kecil
            // - `equals` membandingkan string secara persis
            if (username.equalsIgnoreCase("Fathhy") && password.equals("300305") && captcha.equals("CRIA3")) {
                System.out.println("Login berhasil!\n");
                loginSuccess = true; // Mengubah status login menjadi berhasil
            } else {
                System.out.println("Login gagal, silakan coba lagi.\n");
            }
        }

        System.out.println("+-----------------------------------------------------+");
        System.out.println("Selamat Datang di Supermarket Zhafira");

        // Membuat objek Barang untuk memanfaatkan method getCurrentDateTime
        Barang barang = new Barang("", "", 0.0);
        
        // Menampilkan tanggal dan waktu saat ini menggunakan method getCurrentDateTime
        System.out.println("Tanggal dan Waktu: " + barang.getCurrentDateTime());
        System.out.println("+-----------------------------------------------------+");
        System.out.print("Masukkan Nama Kasir: ");
        String namaKasir = scanner.nextLine();


        try {
            // Input data transaksi
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Exception Handling
            if (hargaBarang < 0 || jumlahBeli < 0) {
                throw new IllegalArgumentException("Harga atau jumlah beli tidak boleh negatif.");
            }

            // Membuat objek transaksi
            Transaksi transaksi = new Transaksi(kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Output transaksi
            System.out.println("+-----------------------------------------------------+");
            System.out.println("No. Faktur: " + noFaktur);

            // Menampilkan detail transaksi
            transaksi.displayTransaksi();
            System.out.println("+-----------------------------------------------------+");
            System.out.println("Kasir: " + namaKasir);
            System.out.println("+-----------------------------------------------------+");

        } catch (IllegalArgumentException e) {
            // Menangkap kesalahan input harga atau jumlah beli
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Menangkap kesalahan umum lainnya
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close(); // Menutup scanner 
        }
    }
}
