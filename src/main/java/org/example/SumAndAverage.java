package org.example;

import org.example.exception.InvalidNumber;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        int count =0,number=0,total=10;
        int sum=0;
        Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter the number");

        while (count < 2) {
            while (count < 1) {

                try {
                    sum += Integer.parseInt(sc.next());
                    count++;

                } catch (NumberFormatException ex) {
                    System.out.println("Please enter valid number");

                }
            }


            //main logic
            if (number > 0) {

                for (int i = 1; i <=total; i++) {
                    sum += sc.nextInt();
                    System.out.println("please enter the number");
                }
                System.out.println("The sum of "+number+" no is : "+sum);
                System.out.println("The Average is :" + sum/total   );
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
