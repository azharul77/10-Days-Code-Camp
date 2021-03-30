
//Find the prime number between 1 to n
package com.example.codeCamp;

import java.util.Scanner;

public class Lprobkem5 {
    public static void main(String [] args){
        int i = 0;
        int N_number;
        int num =0;
        Scanner scan = new Scanner(System.in);
        //Empty String
        System.out.println("Please enter the number range: ");
        N_number = scan.nextInt();
        String  primeNumbers = "";

        for (i = 1; i <= N_number; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);


    }
}
