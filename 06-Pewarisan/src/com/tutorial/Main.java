package com.tutorial;

class Hero {
    // att
    String nama;
    float exp;
    float health;


    void display(){
        System.out.println("Nama Hero :" + this.nama);
        System.out.println("Exp: " + this.exp);
        System.out.println("Health: " + this.health);
    }

}

// subclass
class HeroTank extends Hero {
   
    }


public class Main {
    public static void main(String[] args) {
        // Instansiasi objek Hero
        Hero hero_1 = new Hero();
        hero_1.nama = "Mitha";
        hero_1.display();

        HeroTank hero_2 = new HeroTank();
        hero_2.nama = "Herpat";
        hero_2.display();
    }
}