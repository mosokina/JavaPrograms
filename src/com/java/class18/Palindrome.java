package com.java.class18;

import java.util.Scanner;

public class Palindrome {
//// Write a program to check given number is palindrome or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = sc.nextInt();
        int originalNumber =num;
        int rev = 0;

        while (num != 0) {
           int lastDigit = num % 10; //last digit
           rev = rev*10 +lastDigit; // need to store last digit rev = 1
            num = num / 10; //remove last digit

        }
        System.out.println("Reverse " + rev);


        if (originalNumber== rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

