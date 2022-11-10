package org.example;

import java.util.Scanner;

public class NineSeries {

    public static void main(String[] args) {
    int num1 = 9, sum = 0, num=0, count = 0;
    Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        while (count < 1) {
        try {
            num = Integer.parseInt(sc.next());

        } catch (NumberFormatException ex) {
            System.out.println("please enter valid number");
        }
        if(num<0)
        {
            System.out.println("please enter valid number");
        }
        else break;
    }
        for (int i =1;i<=num;i++)
    {
        if (i > 1 && i<=num) {
            System.out.print(" +");
        }
        System.out.print(num1 );
        num1  = num1*10+9;
        sum+=num1;
    }
    System.out.println();
        System.out.println("The Sum is :"+sum);

}
}

