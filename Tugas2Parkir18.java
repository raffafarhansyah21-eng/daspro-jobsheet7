import java.util.Scanner;

public class Tugas2Parkir18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan;
        int lamaParkir;
        int tarifParkir;
        int biaya;
        int totalPendapatan = 0;   

                while (true) {
            System.out.println("Pilih kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Selesai");
            System.out.print("Pilihan: ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            System.out.print("Lama parkir (jam): ");
            lamaParkir = sc.nextInt();

            if (jenisKendaraan == 1) {
                tarifParkir = 3000;
            } else if (jenisKendaraan == 2) {
                tarifParkir = 2000;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }

            biaya = tarifParkir * lamaParkir;
            totalPendapatan += biaya;

            System.out.println("Biaya parkir: Rp" + biaya);
        }

        System.out.println("Total pendapatan parkir: Rp" + totalPendapatan);

        sc.close();
    }
}