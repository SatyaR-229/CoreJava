package org.example.fourteenTAsk;

import java.util.Scanner;

class Determinant {

        public static void main(String[] args) {
            int size,temp1=0,temp2=0,temp3=0,temp4=0;;
            int [][]matrix;
            int [][]determinant;
            int result;
            Scanner sc = new Scanner(System.in);

            System.out.print("Input the size of the square matrix : ");
            size=Integer.parseInt(sc.next());
            determinant = new int[size-1][size-1];
            System.out.println("Input elements in the first matrix :");
            matrix = new int[size][size];
            for(int i = 0; i<size; i++)
                for (int j =0;j<size;j++)
                {
                    System.out.print("element -["+i+"], ["+j+"] : " );
                    matrix[i][j]=Integer.parseInt(sc.next());
                }
            System.out.println("The matrix is :");

            for(int i = 0; i<size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j] + " ");

                }
                System.out.println();
            }
            for(int i = 1; i<=determinant.length; i++) {
                for (int j = 1; j <= determinant.length; j++) {
                   determinant[i-1][j-1] = matrix[i][j];
                }
                System.out.println();
            }

            for(int i = 0; i<determinant.length; i++) {
                for (int j = 0; j < determinant.length; j++) {
                    if(i == 0 && j ==0)
                    {
                        temp1 = determinant[i][j];

                    }
                    else if (i == 0&& j ==1)
                    {
                        temp2 = determinant[i][j];

                    }
                    else if (i == 1 && j==0)
                    {
                        temp3 = determinant[i][j];


                    }
                    else if(i == 1 && j ==1)
                    {
                        temp4 = determinant[i][j];

                    }
                }
                System.out.println();
            }
            result = (temp1*temp4) - (temp2*temp3);


            System.out.println("The Determinant of the matrix is: "+result);



        }
    }

