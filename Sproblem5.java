
//Trim white space from a string
package com.example.codeCamp;

import java.util.Scanner;

public class Sproblem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence;
        System.out.println("please enter a sentence: ");
        sentence = scan.nextLine();

        char[] strArray = sentence.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                stringBuffer.append(strArray[i]);
            }
        }
        String noSpaceStr2 = stringBuffer.toString();
        System.out.println(noSpaceStr2);
    }
}
