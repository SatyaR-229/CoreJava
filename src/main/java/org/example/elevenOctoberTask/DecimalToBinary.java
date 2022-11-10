package org.example.elevenOctoberTask;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
         number = Integer.parseInt(sc.next());
        String binary = Integer.toBinaryString(number);
        for(int i =1;i<=32;i++) {
            System.out.print(0);
        }



    }
}
