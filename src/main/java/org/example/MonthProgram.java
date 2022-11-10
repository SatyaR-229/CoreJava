package org.example;



import java.util.Scanner;

public class MonthProgram {
    final static int MONTHS =12;

           public static void main(String[] args) {
            int month;
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter the month");
            month = sc.nextInt();
            switch (month) {
                case 1:
                    System.out.println("January Month  have 31 days");
                    break;
                case 2:
                    System.out.println("February Month  have 28 days");
                    break;

                case 3:
                    System.out.println("March  Month  have 31 days");
                    break;

                case 4:
                    System.out.println("April  Month  have 30 days");
                    break;

                case 5:
                    System.out.println("May Month  have 31 days");
                    break;

                case 6:
                    System.out.println("June Month  have 30 days");
                    break;

                case 7:
                    System.out.println("July Month  have 31 days");
                    break;


                case 8:
                    System.out.println("August Month  have 31 days");
                    break;

                case 9:
                    System.out.println("September Month  have 30 days");
                    break;

                case 10:
                    System.out.println("October Month  have 31 days");
                    break;

                case 11:
                    System.out.println("November Month  have 30 days");
                    break;

                case 12:
                    System.out.println("December Month  have 31 days");
                    break;

                    default:
                    System.out.println("Please enter valid month in number between 1 to 12");
                    break;

            }

    }
}
