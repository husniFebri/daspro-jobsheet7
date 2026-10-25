import java.util.*;

public class TugasBioskop {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        int hargaTiket = 50000, jmlTiketDibeli = 0, hrgawl, ttlTiketTerjual = 0, Penghasilan = 0;
        double diskon, hargaDiskon;
        

        System.out.println("===PENJUALAN TIKET BIOSKOP===");
        do {
            System.out.print("Masukkan Jumlah tiket yang dibeli (Ketik 0 untuk menghitung keseluruhan): ");
            jmlTiketDibeli = p.nextInt();

            if (jmlTiketDibeli == 0 ) {
                break;
            }

            if (jmlTiketDibeli < 0) {
                System.out.println("Jumlah tiket tidak valid, Lakukan input ulang!!");
                continue;

            } else if (jmlTiketDibeli > 10) {
                diskon = 0.15;
            }else if (jmlTiketDibeli > 4) {
                diskon = 0.1;
            } else {
                diskon = 0;             
            }

            hrgawl = jmlTiketDibeli * hargaTiket;
            hargaDiskon = diskon * hrgawl;
            hrgawl -= hargaDiskon;

            System.out.println("Anda mendapatkan diskon = " + (int)(diskon*100) + "%");
            System.out.println("Total Bayar = " + (int)(hrgawl));


            ttlTiketTerjual += jmlTiketDibeli;
            Penghasilan += hrgawl ;


        } while (true);

        

        System.out.println("Total tiket terjual hari ini : " + ttlTiketTerjual);
        System.out.println("Total uang masuk pada hari ini : " + Penghasilan);
    }
}