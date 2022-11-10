package org.example;

import java.util.Scanner;

public class NumberPatternPyramidSameSeries {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();

        System.out.println("** Printing the pattern... **");

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
