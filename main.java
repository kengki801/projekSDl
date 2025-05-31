package proyeksdl;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Dokter dokter1 = new Dokter("dr. Andi", "07:00 - 09:00", 1);
        Dokter dokter2 = new Dokter("dr. Budi", "09:00 - 12:00", 2);
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Selamat Datang di Sistem Manajemen Klinik");
        System.out.println("=========================================");
        System.out.println();
        System.out.print("Menu:\n1. Daftar Pasien\n2. Jadwal Dokter\n3. Keluar\nPilih?");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1 -> {
                int antrian = 0;
                antrian++;
                System.out.print("Masukkan Nama Pasien : ");
                String nama = input.nextLine();
                System.out.println();
                System.out.print("Masukkan Umur Pasien : ");
                String umur = input.nextLine();
                System.out.print("Masukkan Keluhan Pasien : ");
                String keluhan = input.nextLine();

                Pasien pasien = new Pasien(nama, umur, keluhan, antrian);
            }
            case 2 -> {
                String jadwal1 = dokter1.toString();
                System.out.println(jadwal1);
                String jadwal2 = dokter2.toString();
                System.out.println(jadwal2);
            }
            default -> {
                System.out.println("Terima Kasih");
            }

        }
    }

}
