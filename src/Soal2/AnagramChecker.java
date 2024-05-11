package Soal2;

import java.util.Arrays;

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
        AnagramChecker tes1 = new AnagramChecker("Heart", "Earth");
        AnagramChecker tes2 = new AnagramChecker("Tom Marvolo Riddle", "I am Lord Voldemort");
        AnagramChecker tes3 = new AnagramChecker("Kekuatan", "Kekuaran");
        System.out.println(tes1.isAnagram());
        System.out.println(tes2.isAnagram());
        System.out.println(tes3.isAnagram());
    }
}
