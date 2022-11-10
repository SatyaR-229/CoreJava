package org.example;

import java.util.Scanner;

public class DigitProgram {
    public static void main(String[] args) {
        DigitProgram dg = new DigitProgram();
        String[] oneDigit = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] twoDigit = {"ten", "eleven", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "Eighteen", "ninteen","twenty"};
        String[] decimal = {"Hundred", "Thousand"};
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        String input = sc.nextLine();
        if(input.length()>=1)
        {
          System.out.println(dg.oneDigit(input));
        }
        else if (input.length()>=2)
        {
            System.out.println(dg.twoDigit(input));
        }

    }

    public String oneDigit(String input) {
        int length = input.length();
        if (input.equals("0")) {
            System.out.println("Zero");
        } else if (length == 1) {
            switch (input) {
                case "1":
                    return "One";


                case "2":
                    return "Two";

                case "3":
                    return "Three";

                case "4":
                   return "Four";

                case "5":
                    return "Five";

                case "6":
                   return "Six";

                case "7":
                    return "Seven";

                case "8":
                    return "Eight";

                case "9":
                    return "Nine";

            }
        }
        return null;

    }

    public String twoDigit(String input)
    {

            switch (input) {
                case "10":
                    return "Ten";

                case "11":
                    return "Eleven";

                case "12":
                    return "Twelve";

                case "13":
                    return "Thirteen";

                case "14":
                    return "Fourteen";

                case "15":
                    return "Fifteen";

                case "16":
                    return "Sixteen";

                case "17":
                    return "Seventeen";

                case "18":
                    return "Eighteen";

                case "19":
                    return "Ninteen";
                case "20":
                    return "Twenty";

            }

return null;
    }
}