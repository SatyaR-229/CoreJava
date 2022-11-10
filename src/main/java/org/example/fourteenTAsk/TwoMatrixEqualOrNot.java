package org.example.fourteenTAsk;

import java.util.Scanner;

public class TwoMatrixEqualOrNot {
    public static void main(String[] args) {
        int size1=0,size2=0,size3=0,size4=0,count =0;
        int[][] matrix1,matrix2;
        boolean check=false;
        Scanner sc = new Scanner(System.in);
        while(count<1) {
        System.out.print("Input Rows and Columns of the 1st matrix :");
        size1 = Integer.parseInt(sc.next());
        size2 = Integer.parseInt(sc.next());
        System.out.print("Input Rows and Columns of the 2st matrix :");
        size3 = Integer.parseInt(sc.next());
        System.out.print(" ");
        size4 = Integer.parseInt(sc.next());

            if (size1 == size3 && size2 == size4) {
                break;
            } else System.out.println("please enter valid row and column");

        }

        System.out.println("Input elements in the first matrix :");
        matrix1 = new int[size1][size2];
        for(int i = 0; i<size1; i++)
            for (int j =0;j<size2;j++)
            {
                System.out.print("element -["+i+"], ["+j+"] : " );
                matrix1 [i][j]=Integer.parseInt(sc.next());
            }


        System.out.println("Input elements in the second matrix :");
        matrix2 = new int[size1][size2];
        for(int i = 0; i<size3; i++)
            for (int j =0;j<size4;j++)
            {
                System.out.print("element -["+i+"], ["+j+"] : " );
                matrix2 [i][j]=Integer.parseInt(sc.next());
            }
        System.out.println("The first matrix is :");

        for(int i = 0; i<size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(matrix1[i][j] + " ");

            }
            System.out.println();
        }
System.out.println("The second matrix is :");
        for(int i = 0; i<size3; i++) {
            for (int j = 0; j < size4; j++) {
                System.out.print(matrix2 [i][j] + " ");

            }
            System.out.println();
        }
        for(int i =0;i<size1;i++)
            for(int j =0;j<size2;j++)
                if(matrix1[i][j]==matrix2[i][j]){
                    check=true;
                }
                    else check = false;

                    if(check==true)
                    {
                            System.out.println("Two Matrix are equal.");
                    }
                    else System.out.println("Two Matrix are not equal");

    }

}
