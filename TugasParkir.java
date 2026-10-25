import java.util.*;

public class TugasParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan Kode kendaraan, \n(0 = keluar, 1 = mobil & 2 = motor) : ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Durasi Parkir: ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;
                } else{
                    total += durasi * 2000;
                }
            }

        }while(jenis !=0);


        System.out.println("Total = " + total);
    }
    
}
