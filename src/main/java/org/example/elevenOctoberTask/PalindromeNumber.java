package org.example.elevenOctoberTask;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number=0,num=0;
        String reverse="",palindrome;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check  whether a number is a palindrome or not :");
        number = Integer.parseInt(sc.next());
        num = number;
        palindrome = Integer.toString(number);
        int count=0;
        while(count<1) {
            for(int i =1;i<=num;) {
                int demo = num % 10;
                reverse += ""+demo;
                num /=10;
            }

            break;
        }
        if(reverse.equals(palindrome)) {
            System.out.println(number+" is a palindrome number.");
        }
        else
        {
            System.out.print(number+" is not a palindrome number");
        }


}

}
