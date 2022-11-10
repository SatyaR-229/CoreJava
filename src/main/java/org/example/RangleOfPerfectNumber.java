package org.example;

import org.example.exception.InvalidNumber;

import java.util.Scanner;

class RangeOfPerfectnumber2 {
    public static void main(String[] args) {
        int num1=0,num2=0,n,i,sum;
        int count =0;
        Scanner sc = new Scanner(System.in);
        while (count<1) {
            try {
                System.out.println("enter first number");
                num1 = Integer.parseInt(sc.next());
                System.out.println("enter second number");
                num2 = Integer.parseInt(sc.next());
                if(num1 >0 && num1<num2)
                {
                    break;
                }
                else System.out.println("please enter valid number");
            } catch (NumberFormatException fx) {
                System.out.println("please enter valid number ");
            }

        }
        for( n = num1;n<=num2;n++)
        {
            i=1;
            sum = 0;
            while(i<n){
                if(n%i==0)
                    sum=sum+i;
                i++;
            }
            if(sum==n)
                System.out.print(n+" ");
        }
        System.out.println("is the number between the range");
        }

            }


