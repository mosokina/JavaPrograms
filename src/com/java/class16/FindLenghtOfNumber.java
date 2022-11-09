package com.java.class16;

import java.util.Scanner;

public class FindLenghtOfNumber {
    public static void main(String[] args) {
        // Write a program to print
        // length of given number
        // Input - 3543346
        // Output - 7

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();
        int count = 0;

        while (num != 0) {
            num = num /10; //taking last digit
            count++;

               }
        System.out.println(count);
        }
    }
