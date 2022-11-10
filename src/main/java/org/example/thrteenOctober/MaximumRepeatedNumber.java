package org.example.thrteenOctober;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumRepeatedNumber {

    public static void main(String[] args) {
        Map <Integer,Integer> map = new HashMap<>();
        int size = 0, counter = 1, difference = 0, count = 0,j=0,k=1,temp=0;
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        size = Integer.parseInt(sc.next());
        int[] element = new int[size];
        int[][] coutAll = new int[8][];
        for (int i = 0; i < size; i++) {
            System.out.print("please enter the element -" + counter + " :");
            element[i] = Integer.parseInt(sc.next());
            counter++;
        }
        System.out.println("you entered element is ");
        for( j = 0;j<element.length;j++)
        {
            for(k =1;j<element.length;k++) {
                if (element[j] == element[k])
                    count++;
            }
            map.put(count,element[j]);

//                for(int l = 0;l<6;l++)
//                {
//                    for(int m =0;m<2;m++)
//                    {
//                        coutAll[l][m]=count;
//                        m++;
//                        coutAll[l][m]=element[j];
//                    }
//                }
//
            }

        }
    }




