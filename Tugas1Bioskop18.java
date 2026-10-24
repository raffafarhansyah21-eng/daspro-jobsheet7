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

