package org.example;

import org.example.exception.InvalidNumber;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int number = 0;
        int factorial=1;
        System.out.println("please enter the number to find the number of the number");
        while (count < 2) {
            while (count < 1) {

                try {
                    number = Integer.parseInt(sc.next());
                    count++;

                } catch (NumberFormatException ex) {
                    System.out.println("Please enter valid number");

                }
            }
            if (number > 0) {
                int local =number;
                for (int i =1;i<=local;local--)
                {
                    factorial *=local;
                }
                System.out.println("The Factorial of "+number+" is: "+factorial);
           

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
