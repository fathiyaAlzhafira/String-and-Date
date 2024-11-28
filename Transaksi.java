public class Transaksi extends Barang {
    int jumlahBeli;
    double total;

    public Transaksi(String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);
        this.jumlahBeli = jumlahBeli;

        // Menghitung total harga (harga barang x jumlah beli)
        this.total = hargaBarang * jumlahBeli;
    }

    // Method untuk menampilkan detail transaksi
    public void displayTransaksi() {
        super.displayBarang(); // Memanggil method dari parent class
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total: " + total);
    }
}
