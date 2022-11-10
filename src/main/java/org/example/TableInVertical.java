package org.example;

import org.example.exception.InvalidNumber;

import java.util.Scanner;

public class TableInVertical {
    public static void main(String[] args) {
        int n1,n2,table=0,i,j;
        Scanner sc = new Scanner(System.in);
    System.out.println("please Enter the from number");
    n1 = sc.nextInt();
    System.out.println("please enter to number");
    n2 = sc.nextInt();
    for( i = 1;i<=10;i++)
    {
        for( j = 1;j<=n2;j++)
        {
            table = j*i;
        }
        System.out.println(j+" X "+i +" = "+ table  );
    }

    }

}
