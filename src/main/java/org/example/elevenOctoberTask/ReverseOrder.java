package org.example.elevenOctoberTask;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        int number=0,num=0;
        String reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the reverse order :");
        number = Integer.parseInt(sc.next());
        num = number;
        int count=0;
        while(count<1) {
            for(int i =1;i<=num;) {
                int demo = num % 10;
                reverse += ""+demo;
                num /=10;
            }

            break;
        }
        System.out.println("The number in reverse order is :"+reverse);



    }

}
