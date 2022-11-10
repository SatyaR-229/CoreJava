package org.example;

import org.example.exception.InvalidNumber;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int naturalNumber = 0;
        System.out.println("please enter the natural number and find the sum of ");
        while (count < 2) {
            while (count < 1) {

                try {
                    naturalNumber = Integer.parseInt(sc.next());
                    count++;

                } catch (NumberFormatException ex) {
                    System.out.println("Please enter valid number");

                }
            }
            if (naturalNumber > 0) {
                int sum=0;
                for (int i = 1; i <= naturalNumber; i++) {
                    sum +=i;
                    System.out.print(i + " ");
                }
                System.out.println();
                System.out.println("The Sum is :"+sum);
                break;
            } else {
                try {
                    throw new InvalidNumber("please enter valid number");
                } catch (InvalidNumber in) {
                    System.out.println("please enter positive number");

                }
                count--;

            }
        }
    }

}
