package Konter_kelompok24_jv;

import java.util.Scanner;

public class Konter_kelompok24_jv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Chairullatif Aji S (21120119120015)");
        System.out.println("Nurhaidah (21120119120003)");
        System.out.println("Kelompok 24");
        System.out.println("Shift 1");
        System.out.println("Beli Handphone Otomatis");
        System.out.println("Masukkan jumlah uang anda (contoh 1000 untuk Rp. 1000,00): ");
        int p = input.nextInt();
        int a, b;
        if (p < 500000) {
            System.out.println("Maaf Handphone dangan harga Rp." + p + ",00 tidak tersedia ");
        } else if (p <= 1000000) {
            System.out.println("Rekomendasi Handphone dari kami adalah: ");
            System.out.println("1. Samsung Galaxy V : 500 Ribu rupiah \n2. Redmi 4x : 800 Ribu rupiah ");
            System.out.print("Masukkan angka untuk membeli: ");
            a = input.nextInt();
            switch (a) {
                case 1:
                    b = p - 500000;
                    System.out.println("Anda membeli Samsung Galaxy V. Sisa uang anda adalah: " + b + " Ribu rupiah");
                    break;
                case 2:
                    b = p - 800000;
                    if (b < 0) {
                        System.out.println("Maaf uang anda tidak cukup");
                    } else {
                        System.out.println("Anda membeli Redmi 4x. Sisa uang anda adalah: " + b + " Ribu rupiah");
                    }
            }
        } else if (p >= 1000000) {
            System.out.println("Rekomendasi Handphone dari kami adalah: ");
            System.out.println("1. Samsung Galaxy Note 9: 1 Juta rupiah \n2. Redmi Note 5 : 1,8 Juta rupiah ");
            System.out.print("Masukkan angka untuk membeli: ");
            a = input.nextInt();
            switch (a) {
                case 1:
                    b = p - 1000000;
                    System.out.println("Anda membeli Samsung Galaxy Note 9. Sisa uang anda adalah: " + b + " Ribu rupiah");
                    break;
                case 2:
                    if (p < 1800000) {
                        System.out.println("Maaf uang anda tidak cukup");
                    } else {
                        b = p - 1800000;
                        System.out.println("Anda membeli Redmi Note 5. Sisa uang anda adalah: " + b + " Ribu rupiah");
                    }
            }
        }

        System.out.println("Terimakasih atas pembelian Anda");

    }
}
