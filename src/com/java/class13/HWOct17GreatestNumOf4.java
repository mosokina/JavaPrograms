package com.java.class13;

import java.util.Scanner;

public class HWOct17GreatestNumOf4 {
    public static void main(String[] args) {
        //2. Write a program to find greatest number out of four numbers using the method
        //Input
        //Enter Four Number
        //10
        //45
        //75
        //24
        //
        //Output
        //75 is the greatest number

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter first number");
            int num1 = sc.nextInt();
            System.out.println("Please enter second number");
            int num2 = sc.nextInt();
            System.out.println("Please enter third number");
            int num3 = sc.nextInt();
            System.out.println("Please enter fourth number");
            int num4 = sc.nextInt();

            int max1 = findMax(num1, num2);
            int max2 = findMax(num3, num4);

            System.out.println("Greatest number " + findMax(max1, max2));
        }

        static int findMax(int a, int b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
    }