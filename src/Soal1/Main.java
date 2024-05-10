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
