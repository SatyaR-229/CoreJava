package org.example;

import org.example.exception.InvalidNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int number = 0;
        System.out.println("please enter a  number to check whether perfect number or not. ");
        while (count < 2) {
            while (count < 1) {

                try {
                    number = Integer.parseInt(sc.next());
                    count++;

                } catch (NumberFormatException ex) {
                    System.out.println("Please enter valid number");

                }
            }
            if (number > 0) {
                int local = number;
                int sum =0,total=0;
                //the sum which is divisible by itself  and come in the range except 1
             for(int i =2;i<=number;i++)
             {
                 if(number % i == 0)
                 {

                     sum = number / i;
                     System.out.print(sum+" ");
                     total+= sum;

                 }
             }
             System.out.println("is positive divisor");
             System.out.println("The sum of the divisor is : "+total);
             if(number == total)
             {
                 System.out.println("so, the number is perfect number.");
             }else System.out.println("So, the number is not perfect.");
                break;
            } else {
                try {
                    throw new InvalidNumber("please enter valid number");
                } catch (InvalidNumber in) {
                    System.out.println("please enter positive number");

                }
                count--;

            }
        }
    }
}
