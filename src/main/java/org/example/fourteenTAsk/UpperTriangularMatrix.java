package org.example.fourteenTAsk;

import java.util.Scanner;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        int size;
        int [][]matrix;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the size of the square matrix : ");
        size=Integer.parseInt(sc.next());
        System.out.println("Input elements in the first matrix :");
        matrix = new int[size][size];
            for(int i = 0; i<size; i++)
            for (int j =0;j<size;j++)
            {
                System.out.print("element -["+i+"], ["+j+"] : " );
                matrix[i][j]=Integer.parseInt(sc.next());
            }

            for(int i = 0; i<size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j] + " ");

                }
                System.out.println();
            }
            for(int i = 0; i<size; i++) {
                for (int j = 0; j < size; j++) {
                  if(i<j)
                   System.out.print("0");
                  else System.out.print(matrix[i][j]);

                }
                System.out.println();
            }





        }
}
