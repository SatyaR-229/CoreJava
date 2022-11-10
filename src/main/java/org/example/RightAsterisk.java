package org.example;

import org.example.exception.InvalidNumber;

import java.util.Scanner;

public class RightAsterisk {
    public static void main(String[] args) {
        int row=0, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the row");
        

        
        while (count < 2) {
            while (count < 1) {

                try {
                    row =Integer.parseInt( sc.next());
                    count++;

                } catch (NumberFormatException ex) {
                    System.out.println("Please enter valid number");

                }
            }
            if (row > 0) {
                for(int i =1;i<=row;i++)
                {
                    for(int j = 1;j<=i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
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
