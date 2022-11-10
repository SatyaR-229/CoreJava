package org.example.own;

import java.util.Scanner;

public class IncreasingDecreasingOrder {
    public static void main(String[] args) {
        int number1,number2,number3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        number1 = sc.nextInt();
        System.out.println("enter second number");
        number2 = sc.nextInt();
        System.out.println("enter third number");
        number3=sc.nextInt();
        if(number1<number2 && number2<number3)
        {
            System.out.println("number is in increasing order");
        }
        else if(number1>number2 && number2>number3)
        {
            System.out.println("number is in decreasing order");
        }
        else  System.out.println("number is in neither increasingqwerqweqqwqweruqweqwqwe nor decreasing");

    }
}
