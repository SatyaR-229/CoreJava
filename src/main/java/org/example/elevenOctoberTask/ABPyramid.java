package org.example.elevenOctoberTask;

import java.util.Scanner;

public class ABPyramid {
//    public static void main(String[] args) {
//        int row=5;
//        for(int i =1;i<=row;i++)
//        {
//            for(int j = row;j>i;j--)
//            {
//                System.out.print(" ");
//            }
//            for(int k =1;k<=i+2;k++)
//            {
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
public static void main(String[] args)
{
    // Create a new Scanner object
    Scanner scanner = new Scanner(System.in);
    // Get the number of rows from the user
    System.out.println("Enter the number of rows to print the pattern ");
    int rows = scanner.nextInt();
    System.out.println("** Printing the pattern... **");
    for (int i = 1; i <= rows; i++)
    {
        for (int j = rows; j > i; j--)
        {
            System.out.print(" ");
        }

        for (int k = 1; k <= i; k++)
        {

            System.out.print( "A");

        }

        for (int l = i - 1; l >= 1; l--)
        {
            System.out.print( "B");

        }
        System.out.println();
    }
}
}
