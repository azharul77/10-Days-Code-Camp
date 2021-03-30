package com.example.codeCamp;

import java.util.Scanner;

public class Sproblem1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("\n Enter String: ");
        String s = scan.nextLine();
        int i, n;
        char c;
        String z = "";

        for (i = 0; i<s.length(); i++) {
            c = s.charAt(i);
            if (c >= 97 && c<= 122) //If ASCII values represent LowerCase, changing to Upper Case
            {
                n = c - 32;
                c = (char) n;
            }
            z = z + c;
        }
        System.out.println("\nUpper Case: " + z);
        z = "";

        for (i = 0; i<s.length(); i++) {
            c = s.charAt(i);
            if (c >= 65 && c<= 90) //If ASCII values represent UpperCase, changing to Lower Case
            {
                n = c + 32;
                c = (char) n;
            }
            z = z + c;
        }
        System.out.println("\nLower Case: " + z);
        z = "";
    }
}
