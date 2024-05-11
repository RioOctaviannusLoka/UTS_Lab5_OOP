package Soal2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    private String kata;
    private String anagram;

    public AnagramChecker(String kata, String anagram){
        this.kata = kata;
        this.anagram = anagram;
    }

    public boolean isAnagram(){
        kata = kata.replaceAll("\\s", "");
        anagram = anagram.replaceAll("\\s", "");
        if(kata.length() != anagram.length()) {
            return false;
        } else {
            char[] arrKata = kata.toLowerCase().toCharArray();
            char[] arrAnagram = anagram.toLowerCase().toCharArray();

            Arrays.sort(arrKata);
            Arrays.sort(arrAnagram);

            return Arrays.equals(arrKata, arrAnagram);
        }
    }

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
