/*Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics, and Computer.
        Calculate percentage and grade according to the following:*/
package com.example.codeCamp;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float pyhsics = scan.nextFloat();

        float Physics, Chemistry, Biology, Mathematics, Computer;
        double total, average, parcentage;

        System.out.println("Please enter the mark of five subjects: ");
        System.out.println("Enter the mark of physics: ");
        Physics = scan.nextFloat();
        System.out.println("Enter the mark of Chamistry: ");
        Chemistry = scan.nextFloat();
        System.out.println("Enter the mark of Biology: ");
        Biology = scan.nextFloat();
        System.out.println("Enter the mark of Mathmatics: ");
        Mathematics = scan.nextFloat();
        System.out.println("Enter the mark of Computer: ");
        Computer = scan.nextFloat();

//        Calculation part

        total = Physics + Chemistry + Biology + Mathematics + Computer;
        average = total / 5;
        parcentage = (total / 500) * 100;

//         appling condition

        if (parcentage >= 90) {
            System.out.println("Grade A");
        }

        else if (parcentage >= 80) {
            System.out.println("Grade B");
        }

        else if (parcentage >= 70) {
            System.out.println("Grade C");
        }

        else if (parcentage >= 60) {
            System.out.println("Grade D");
        }

        else if (parcentage >= 40) {
            System.out.println("Grade E");
        }

        else {
            System.out.println("Grade F");
        }

        System.out.println("The parcentage of result is " + parcentage + "%");

    }
}
