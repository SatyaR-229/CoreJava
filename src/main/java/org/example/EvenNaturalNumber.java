package org.example;

import org.example.exception.InvalidNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNaturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int number = 0;
        System.out.println("please enter the number to find the natural number of a number");
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
                List<Integer> arrayList = new ArrayList<Integer>(number);
                int local =number,j=0,sum=0;
               for(int i =1;i<=local;  i++)
               {
                   if(i %2 == 0)
                   {
                       arrayList.add(i);
                       System.out.print(arrayList.get(j)+" ");
                       sum += arrayList.get(j);
                       j++;
                   }
               }
                System.out.print("are Even number");
               System.out.println();
               System.out.println("The Sum of even Natural Number upto "+number+ " terms : "+sum);
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
