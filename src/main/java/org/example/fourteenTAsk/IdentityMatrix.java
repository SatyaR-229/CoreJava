package org.example.fourteenTAsk;



import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        int row,column;
        int [][]matrix;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of Rows for the matrix :");
        row=Integer.parseInt(sc.next());
        System.out.print("Input number of column for the matrix :");
        column=Integer.parseInt(sc.next());
        System.out.println("Input elements in the first matrix :");
        matrix = new int[row][column];
        for(int i = 0; i<row; i++)
            for (int j =0;j<column;j++)
            {
                System.out.print("element -["+i+"], ["+j+"] : " );
                matrix[i][j]=Integer.parseInt(sc.next());
            }

        for(int i = 0; i<row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        for(int i =0;i<row;i++)
            for (int j =0;j<column;j++)
            {
                if(matrix[i][j]+0 == matrix[i][j])
                {
                    flag = true;
                }
                else flag = false;
            }

        if(flag)
            System.out.println("The matrix is an identity matrix.");
        else System.out.println("The matrix is not an identity matrix.");
    }
}
