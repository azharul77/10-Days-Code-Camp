package com.example.codeCamp;

import java.util.Scanner;

public class problem2 {
   public static void main(String [] args){
       Scanner scan = new Scanner(System.in);

       float Basic, Gross, hra, da;

       System.out.println("Enter the basic salary of a employee: ");
       Basic = scan.nextFloat();

       //condition applying

       if(Basic <= 10000) {
           hra = (float) (Basic * 0.2);
           da = (float) (Basic * 0.8);
       } else if(Basic <= 20000){
           hra = (float) (Basic * 0.25);
           da = (float) (Basic * 0.9);
       }else{
           hra = (float) (Basic * 0.3);
           da = (float) (Basic * 0.95);
       }

       //calculation part

       Gross = (Basic+hra+da);
       System.out.println("The gross salary is: "+Gross+" taka");

   }

}
