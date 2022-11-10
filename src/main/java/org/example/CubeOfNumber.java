package org.example;

import org.example.exception.InvalidNumber;

import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int number = 0;
        System.out.println("please enter the natural number and find the sum of natural number");
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
                int cube = 1,n=3;
                for (int i = 1; i <= number; i++){
                    for (int j = i; j <=n ; j++) {
                        cube *= i;
                    }
                    System.out.println("Number is : "+i+" and cube of the "+i+" is :" +cube);
                    cube=1;
                    n++;
            }


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
