package Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata 1: ");
        String kata = input.nextLine();
        System.out.print("Masukkan kata 2: ");
        String anagram = input.nextLine();
        AnagramChecker tesInput = new AnagramChecker(kata, anagram);
        System.out.println(tesInput.isAnagram());
    }
}
