package com.tutorial;

class Lingkaran {
    float jarijari;

    public Lingkaran (float jarijari) {
        this.jarijari = jarijari;
    }
    void display() {
        float luas = (float)(Math.PI*jarijari*jarijari);
        float keliling = (float) (2*3.14*jarijari);
        System.out.println("Keliling lingkaran " + luas);
        System.out.println("Luas Lingkaran " + keliling);
    }
    public static void main(String[] args) throws Exception {
        Lingkaran lingkaran = new Lingkaran(19);
        System.out.println("Jari-jari : " + lingkaran.jarijari);
        lingkaran.display();
    }
}