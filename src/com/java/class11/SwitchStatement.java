package com.java.class11;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {


//Write a program to get month number from user and print number of days in the
//given month (1 to 12 only)
//Example
//Input - 1
//Ouput - 31 days
//Input - 2
//Output - 28/29 days
//Input - 11
//Output - 30 days
                System.out.println("Please enter number: ");
                Scanner sc = new Scanner(System.in);

                int num = sc.nextInt();

                switch (num){

                    case 1:
                        System.out.println("31 days");
                        break;
                    case 2:
                        System.out.println("28/29 days");
                        break;
                    case 3:
                        System.out.println("31 days");
                        break;
                    case 4:
                        System.out.println("30 days");
                        break;
                    case 5:
                        System.out.println("31 days");
                        break;
                    case 6:
                        System.out.println("30 days");
                        break;
                    case 7:
                        System.out.println("31 days");
                        break;
                    case 8:
                        System.out.println("31 days");
                        break;
                    case 9:
                        System.out.println("30 days");
                        break;
                    case 10:
                        System.out.println("31 days");
                        break;
                    case 11:
                        System.out.println("30 days");
                        break;
                    case 12:
                        System.out.println("31 days");
                        break;
                    default:
                        System.out.println("Please enter number from 0 to 12 only");
                }
            }
        }


