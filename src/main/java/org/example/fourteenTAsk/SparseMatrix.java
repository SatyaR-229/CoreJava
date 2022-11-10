package org.example.fourteenTAsk;

import java.util.Scanner;

public class SparseMatrix {

    public static void main(String[] args) {
        int row,column,count=0,half;
        int [][]matrix;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of rows of the matrix :");
        row=Integer.parseInt(sc.next());
        System.out.print("Input the number of columns of the matrix  :");
        column=Integer.parseInt(sc.next());
        matrix = new int[row][column];
        half = row*column;
        half /=2;
        for(int i = 0; i<row; i++)
            for (int j =0;j<column;j++)
            {
                System.out.print("element -["+i+"], ["+j+"] : " );
                matrix[i][j]=Integer.parseInt(sc.next());
            }

        for(int i = 0; i<row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                }
            }


        }
        if(count>half) {
            System.out.println("The given matrix is sparse matrix.");
            System.out.println("There are " + count + " number of zeros in the matrix");
        }
        else if(count == half)
        {
            System.out.println("The given matrix having equal zero and non-zero value.");

        }
        else  System.out.println("The given matrix is not sparse matrix.");
    }
}
