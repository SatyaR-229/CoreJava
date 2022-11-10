package org.example;

import java.util.Scanner;

public class AreaOfGeometricalShape {
    final static float PI = 3.14f;
    public static void main(String[] args)throws Exception {
        int choice,count=0;
        float length,base,height,width,diagonal1,diagonal2,radius,area,side1,side2;


        while (count<1) {
            System.out.println("find area of circle press: 1");
            System.out.println("find area of triangle press: 2");
            System.out.println("find area of square press: 3");
            System.out.println("find area of rectangle press: 4");
            System.out.println("find area of Parallelogram press: 5");
            System.out.println("find area of trapezium press: 6");
            System.out.println("find area of ellipse press: 7");
            System.out.println("for terminate the program press : 8");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("you selected area of circle");
                    System.out.println("enter radius of circle");
                    radius = sc.nextFloat();
                    area = PI * radius;
                    System.out.println("**********"+"Area of circle is : " + area+" **********");
                    break;
                case 2:
                    System.out.println("you selected area of triangle");
                    System.out.println("enter base of triangle");
                    base = sc.nextFloat();
                    System.out.println("enter height of trianle");
                    height = sc.nextFloat();
                    area = (base * height) / 2;
                    System.out.println("********** "+"area of triangle is: " + area+" **********");
                    break;
                case 3:
                    System.out.println("you selected area of square");
                    System.out.println("enter length of side");
                    length = sc.nextFloat();
                    area = length * 2;
                    System.out.println("********** "+"area of square is:" + area +" **********");
                    break;
                case 4:
                    System.out.println("you selected rectangle");
                    System.out.println("enter length of rectangle");
                    length = sc.nextFloat();
                    System.out.println("enter width of rectangle");
                    width = sc.nextFloat();
                    area = length * width;
                    System.out.println("********** "+"area of rectangle is: " + area+" **********");
                    break;
                case 5:
                    System.out.println("you selected area of Parallelogram");
                    System.out.println("enter length of Parallelogram");
                    length = sc.nextFloat();
                    System.out.println("enter height of parallelogram");
                    height = sc.nextFloat();
                    area = length * height;
                    System.out.println("********** "+"area of Parallelogram is: " + area+"**********");
                    break;
                case 6:
                    System.out.println("you selected trapezium ");
                    System.out.println("enter side1 of  trapezium");
                    side1 = sc.nextFloat();
                    System.out.println("enter side2 of  trapezium");
                    side2 = sc.nextFloat();
                    System.out.println("enter height of trapezium");
                    height = sc.nextFloat();
                    area = side1 * side2 / 2 * height;
                    System.out.println("********** "+"area of trapezium is: " + area+" **********");
                    break;
                case 7:
                    System.out.println("you selected rhombus");
                    System.out.println("enter first diagonal of rhombus");
                    diagonal1 = sc.nextFloat();
                    System.out.println("enter second diagonal of rhombus");
                    diagonal2 = sc.nextFloat();
                    area = diagonal1 * diagonal2 / 2;
                    System.out.println("********** "+ "area of rhombus is: " + area+" **********");
                    break;
                case 8:
                    System.out.println("...terminated program...");
                    count = 1;

                    break;
                default:
                    System.out.println("please enter valid number");
            }
        }

    }
}
