import java.text.SimpleDateFormat;
import java.util.Date;

public class Barang {
    String kodeBarang;
    String namaBarang;
    double hargaBarang;

    // Constructor untuk inisialisasi data barang
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Method untuk menampilkan data barang
    public void displayBarang() {
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
    }

    // Method untuk mendapatkan tanggal dan waktu saat ini
    public String getCurrentDateTime() {
        // Membuat objek Date untuk mengambil waktu sekarang
        Date date = new Date();

        // Membuat objek SimpleDateFormat untuk memformat objek Date menjadi string
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        // Mengembalikan string tanggal dan waktu dalam format yang ditentukan
        return formatter.format(date);
    }
}
