package com.example.codeCamp;

import java.util.Scanner;

public class Lproblem1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int starting = 1;
        int N_number;

        System.out.println("Enter natural number range: ");
        N_number = scan.nextInt();

        while(starting <= N_number){
            System.out.println("All the natural numbers are: "+starting);

            starting++;
        }


    }
}
