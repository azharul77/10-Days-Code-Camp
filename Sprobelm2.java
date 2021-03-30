package com.example.codeCamp;

import java.util.Locale;
import java.util.Scanner;

public class Sprobelm2 {
    public static void main (String [] args){
        int vCount = 0, cCount = 0;
        Scanner scan = new Scanner(System.in);
        String sentence;

        System.out.println("Please enter a sentence: ");
        sentence = scan.nextLine();

        sentence = sentence.toLowerCase();

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                //Increments the vowel counter
                vCount++;
            }

            else if(sentence.charAt(i) >= 'a' && sentence.charAt(i)<='z') {
                //Increments the consonant counter
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
