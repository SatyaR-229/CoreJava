package org.example.elevenOctoberTask;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        int start=0,end=1,sum;
        Scanner sc = new Scanner(System.in);
        int term =  sc.nextInt();
        System.out.print(start+" "+end);
        for(int i = 2;i<term;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            sum=start+end;
            System.out.print(" "+sum);
            start=end;
            end=sum;

        }
    }

    }

