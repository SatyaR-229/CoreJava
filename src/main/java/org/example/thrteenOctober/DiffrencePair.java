package org.example.thrteenOctober;

import java.util.Scanner;

public class DiffrencePair {
    public static void main(String[] args) {
        int size =0,counter =1,difference =0,count=0;
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        size = Integer.parseInt(sc.next());
        int [] element = new int[size];
        System.out.println("please enter the difference of element");
        difference = Integer.parseInt(sc.next());
        for(int i =0;i<size;i++)
        {
            System.out.print("please enter the element -"+counter+" :");
            element[i]= Integer.parseInt(sc.next());
            counter++;
        }
        System.out.print("The distinct pairs for difference "+difference+" are: ");
        for(int j =0;j<element.length;j++) {
            for (int k = j + 1; k < element.length; k++) {
                if (element[j] - element[k] == difference ||element[j] - element[k] == -difference  ) {//how to ignore sign
                    count++;                                                                           // we will ignore the sign
                    System.out.print("[" + element[j] + "," + element[k] + "] ");
                }
            }
        }
        System.out.println();
        System.out.println("Number of distinct pairs for difference     "+difference+" are:"+ count);
    }
}
