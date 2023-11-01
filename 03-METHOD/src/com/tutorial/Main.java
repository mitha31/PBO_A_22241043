package com.tutorial;

class Mahasiswa{
    //Data Member
    String nama;
    String nim;
    String prodi;

    // construktor dengan parameter
    Mahasiswa (String nama, String nim,
    String prodi){
     this.nama = nama;
     this.nim = nim;
      this.prodi = prodi;

    } 

    // method tanpa parameter dan tanpa return
    void show(){
      System.out.println("nama:" + this.nama);
      System.out.println("nim:" + this.nim);
      System.out.println("prodi:" + this.prodi);

    }
    //Method tanpa return dengan parameter
    void setNama(String nama){
      this.nama = nama;
    }
    //Method dengan return tanpa parameter
    String getNama(){
      return this.nama;

    }
    //Method dengan return dan parameter
    String sayHi(String pesan){
      return pesan + " Aku adalah " + this.nama;
    }
   }
   public class Main{
       public static void main(String[] args) {
         //instansi objek
         Mahasiswa mhs1 = new Mahasiswa("Mitha Puspitasari","22241043","PTI");
         mhs1.show();
         mhs1.setNama( "Mitha");
         mhs1.show();
         System.out.println(mhs1.getNama());

         String pesan = mhs1.sayHi("Hallo");
         System.out.println(pesan);
       }
   }
