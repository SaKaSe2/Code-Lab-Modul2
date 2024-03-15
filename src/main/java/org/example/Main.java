package org.example;

class Mahasiswa {
    private final String nama;
    private final String nim;
    private final String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String tampilDataMahasiswa() {
        return "Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan;
    }
}
