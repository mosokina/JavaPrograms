package com.java.class11;

import java.util.Scanner;

public class SwitchStatementCombine {
    public static void main(String[] args) {

        System.out.println("Please enter number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println("31 days in this month");
                break;

            case 2:
                System.out.println("28/29 days in this month");
                break;


            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println("30 days in this month");
                break;



            default:
                System.out.println("Please enter number from 0 to 12 only");
        }
    }
}
