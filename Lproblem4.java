//Find ascii code from input character.
package com.example.codeCamp;

import java.util.Scanner;

public class Lproblem4 {
    public static void main(String [] args){
        char ch;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character: ");
        ch = scan.next().charAt(0);
        int ascii = ch;

        System.out.println("The ASCII code is: "+ascii);

    }
}
