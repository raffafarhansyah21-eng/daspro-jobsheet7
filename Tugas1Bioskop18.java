import java.util.Scanner;

public class Tugas1Bioskop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahPelanggan;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;
        double hargaSebelumDiskon;
        double diskon;
        double totalBayar;

        System.out.print("Masukkan jumlah pelanggan: ");
        jumlahPelanggan = sc.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.println("\nTransaksi pelanggan ke-" + i);

            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();

        while (jumlahTiket < 0) {
            System.out.println("Jumlah tiket tidak valid!");
            System.out.print("Masukkan ulang jumlah tiket: ");
            jumlahTiket = sc.nextInt();
        }

            hargaSebelumDiskon = jumlahTiket * hargaTiket;
            diskon = 0;

            if (jumlahTiket > 4 ) {
                diskon = 0.10;
            } else if (jumlahTiket > 10) {
                diskon = 0.15;
            }

            totalBayar = hargaSebelumDiskon - (hargaSebelumDiskon * diskon);

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;

            System.out.println("Harga sebelum diskon: Rp" + hargaSebelumDiskon);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total bayar: Rp" + totalBayar);
        }

        System.out.println("\n=== RINGKASAN PENJUALAN ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp" + totalPenjualan);

        sc.close();
    }
}