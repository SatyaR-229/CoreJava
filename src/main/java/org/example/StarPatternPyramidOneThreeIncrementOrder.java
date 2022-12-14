package org.example;

import java.util.Scanner;

public class StarPatternPyramidOneThreeIncrementOrder {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();

        System.out.println("** Printing the pattern... **");

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(  " *");
            }
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(  " *");
            }
            System.out.println();
        }
    }
}
