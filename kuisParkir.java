import java.util.Scanner;

public class kuisParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int parkirLebih3Jam = 0;
        int parkirTerlama = 0;

        System.out.print("Lama parkir (jam, 0 = selesai): ");
        jam = sc.nextInt();
        while (jam != 0) {
            if(jam<1 || jam>24){
                System.out.print("Input tidak valid.");
                continue;
            } else {
                // Tarif: jam pertama Rp 5000, jam berikutnya Rp 3000 per jam
                int biaya = 5000 + (jam - 1) * 3000;
                total += biaya;
                System.out.println("Biaya parkir: Rp " + biaya);

                System.out.print("Lama parkir (jam, 0 = selesai): ");
                jam = sc.nextInt();
                jumlahKendaraan++;
            }

            if(jam>3){
                parkirLebih3Jam++;
            }

            if(jam>parkirTerlama){
                parkirTerlama = jam;
            }
            
        }
        

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Kendaraan yang parkir terlama  : " + parkirTerlama + " jam");
        System.out.println("Kendaraan yang parkir lebih dari 3 jam  : " + parkirLebih3Jam);
        sc.close();

    }
}