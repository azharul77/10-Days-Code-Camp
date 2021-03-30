
//Print odd and even number from n to 1.

package com.example.codeCamp;

import java.util.Scanner;

public class Lproblem2 {
    public static void main(String [] args){
        int starting, N_number ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the last Number: ");
        N_number = scan.nextInt();

        for(starting = 2; N_number >= starting; starting = starting + 2){
            System.out.println("The Even numbers are: "+starting);

        }

        for(starting = 1; N_number >= starting; starting = starting + 2){
            System.out.println("the odd numbers are: "+starting);
        }
    }
}
