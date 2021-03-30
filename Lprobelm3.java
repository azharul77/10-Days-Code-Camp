package com.example.codeCamp;

import java.util.Scanner;

public class Lprobelm3 {
    public static void main(String [] args){
        int starting, N_number, sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the last Number: ");
        N_number = scan.nextInt();

        for(starting = 2; starting <= N_number; starting = starting + 2,sum+= starting){
            System.out.println("The Even numbers are: "+starting);
        }
        System.out.println("The sum is: "+sum);

        for(starting = 1; starting <= N_number; starting = starting + 2, sum+= starting){
            System.out.println("the odd numbers are: "+starting);
        }
        System.out.println("The sum is: "+sum);
    }
}
