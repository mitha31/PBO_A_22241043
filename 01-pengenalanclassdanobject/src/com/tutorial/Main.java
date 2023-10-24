package com.tutorial;

class Mahasiswa {
   String nama;
   String nim;
   String prodi;
}
public class Main {
 public static void main(String[] args) {
 Mahasiswa MHS1 = new Mahasiswa();
 MHS1.nama = "Mitha Puspitasari";
 MHS1.nim = "22241043";
 MHS1.prodi = "PTI";
   System.out.println("nama mahasiswa:" + MHS1.nama); 
   System.out.println("nim mahasiswa:" + MHS1.nim); 
   System.out.println("prodi mahasiswa:" + MHS1.prodi); 
Mahasiswa MHS2 = new Mahasiswa();
 MHS2.nama = "Nurul Wahidah";
 MHS2.nim = "22231034";
 MHS2.prodi = "PTI";
   System.out.println("nama mahasiswa:" + MHS2.nama); 
   System.out.println("nim mahasiswa:" + MHS2.nim); 
   System.out.println("prodi mahasiswa:" + MHS2.prodi);  
}   
}
