package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    private static final ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                tambahDataMahasiswa(scanner);
            } else if (choice == 2) {
                tampilkanDataMahasiswa();
            } else if (choice == 3) {
                System.out.println("Adios");
                break;
            } else {
                System.out.println("Pilihan tidak valid, harap pilih angka antara 1 dan 3.");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void tambahDataMahasiswa(Scanner scanner) {
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.next();

        String nim;
        do {
            System.out.print("Masukkan NIM mahasiswa (15 digit): ");
            nim = scanner.next();
            if (nim.length() != 15) {
                System.out.println("NIM harus terdiri dari 15 digit. Silakan coba lagi.");
            }
        } while (nim.length() != 15);

        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = scanner.next();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
        dataMahasiswa.add(mahasiswa);
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    private static void tampilkanDataMahasiswa() {
        if (dataMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa yang ditambahkan.");
        } else {
            System.out.println("Data Mahasiswa:");
            for (Mahasiswa mahasiswa : dataMahasiswa) {
                System.out.println(mahasiswa.tampilDataMahasiswa());
            }
        }
    }
}
