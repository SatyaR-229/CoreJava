package org.example;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(i =1;i<=row;i++)
        {
            System.out.print(" ");
            for (j = 1;j<i+1;j++)
            {

               System.out.print(" * ");
            }
            System.out.println();


        }
    }
}