package Soal1;

// import scanner method
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner instantiation (Scanner Object)
        Scanner input = new Scanner(System.in);

        // adventurer user input
        System.out.print("Masukkan nama : ");
        String name = input.nextLine();
        System.out.print("Masukkan level : ");
        int level = input.nextInt();
        System.out.print("Masukkan total power : ");
        int power = input.nextInt();

        // Adventurer Object
        Adventurer petualang = new Adventurer(name, level, power);
        System.out.println();
        petualang.Introduction();
        petualang.attack();
        petualang.attack(15);
        petualang.setName("Satou Kazuma");
        System.out.println(petualang.getName());
        System.out.println();
        System.out.println();

        // magician user input
        System.out.print("Masukkan nama : ");
        name = input.next();
        System.out.print("Masukkan level : ");
        level = input.nextInt();
        System.out.print("Masukkan total power : ");
        power = input.nextInt();

        // Magician Object
        Magician penyihir = new Magician(name, level, power);
        System.out.println();
        penyihir.Introduction();
        penyihir.attack();
    }
}

// Penjelasan Naratif
/*
Dalam main class, dilakukan import library Scanner. Selanjutnya dilakukan instantiation objek Scanner bernama input.
Lalu dilakukan input dari user berupa nama, level, dan power. Selanjutnya dilakukan instantiation objek adventurer.
Dalam pembuatan objek adventurer yang dinamakan petualang, dimasukkan 3 buah parameter yaitu name, level, dan power. Ketiga parameter tersebut
dibutuhkan oleh constructor dari class adventurer
Petualang memiliki beberapa method, yaitu method setter dan getter untuk ketiga attribute yaitu name, level, dan power.
Method setter name akan membuat user dapat mengubah nilai attribute nama dari objek adventurer, sedangkan method getter name akan mengembalikan attribute nama dari objek adventurer. Demikian juga halnya untuk level dan power.
Petualang juga memiliki method introduction, dimana terdapat beberapa kondisi yang akan menentukan apakah petualang itu
berada dirank bronze, silver, atau gold. Selain ranknya, petualang juga akan memberitahu nama, level, dan powernya.
Petualang memiliki method lain, yaitu attack. Method attack dapat dipanggil tanpa memasukkan parameter, dimana akan tercetak
dmg yang dihasilkan oleh petualang berdasarkan jumlah power petualang. Method attack juga dilakukan overloading method, dimana
method attack dapat dimasukkan sebuah parameter, yaitu power. Power ini akan menentukan seberapa besar dmg yang dihasilkan oleh
petualang berdasarkan power. Apabila power lebih besar dari power yang dimiliki oleh petualang (private attribute), maka akan
tercetak tulisan bahwa serangan dari petualang telah meleset.

Selanjutnya, dilakukan input dari user berupa nama, level, dan power.
Setelah itu, dilakukan instansiasi objek Magician yang dipanggil dengan penyihir. Dalam proses instansiasi tersebut, dimasukkan beberapa
attribute yang telah diinput user sebelumnya kedalam constructor, yaitu nama, level, dan power.
Class Magician merupakan child class dari class Adventurer. Magician mewarisi method Setter dan getter, introduction, dan attack dari class Adventurer
Method introduction dan attack pada class Magician merupakan method overriding. Dimana pada class Magician, method introduction akan membuat objek Magician memperkenalkan dirinya sebagai Magician.
Sedangkan pada method attack, akan dicetak bahwa magician menghasilkan magic dmg sebesar 10 kali powernya.
*/