package com.tutorial;

// class tanpa konstruktor
class Polos {
     String dataString;
     int dataInteger;

}

// class dengan konstruktor
class Mahasiswa {
    String nama;
    String nim;
    String prodi;

    // membuat konstruktor dengan parameter

    Mahasiswa(String inputNama, String inputNIM, String InputProdi) {
        nama = inputNama;
        nim = inputNIM;
        prodi = InputProdi;
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Prodi: "+prodi);
    }
} 

public class Main {
    public static void main(String[] args) {
        // Memanggil konstruktor
        new Mahasiswa("Mitha Puspitasari", "22241043", "PTI");
    }
}
