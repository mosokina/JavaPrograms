package com.java.class12;

import java.util.Scanner;

public class HWOct12Task1ReverseOfGreatestOf3Numbers {
    public static void main(String[] args) {
        //1.Write a program to take three numbers from user and find reverse of the greatest number (3 digit number)

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

        System.out.println("Reverse greatest number is: "); reverseOfGreatestNumber (num1, num2, num3);
    }
            static void reverseOfGreatestNumber ( int a, int b, int c){
            int result;

            if (a > b && a > c) {
                result = a;
            } else if (b > c) {
                result = b;
            } else {
                result = c;
            }

            int rev = 0;
            int lastDigit = result % 10;

            rev = rev * 10 + lastDigit;

            result = result / 10;

            lastDigit = result % 10;
            rev = rev * 10 + lastDigit;
            result = result / 10;

            lastDigit = result % 10;
            rev = rev * 10 + lastDigit;
            result = result / 10;

            System.out.println(rev);
        }
    }
