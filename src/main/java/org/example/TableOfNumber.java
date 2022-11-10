package org.example;

import org.example.exception.InvalidNumber;

import java.util.Scanner;

public class TableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int number = 0;
        System.out.println("please enter the number to find the table of number");
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
                int table =0;
                for (int i =1; i <= 10;i++ ){
                    for (int j = 1; j <=i  ; j++) {
                        table = number * j;
                    }
                    System.out.println(number+" X "+i+ " = "+table);

                }
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
