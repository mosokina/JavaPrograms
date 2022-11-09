package com.java.class15;

import java.util.Scanner;

public class FactorialOfGivenNum {

    // Write a program to print sum of 1 to 5
    // Output - 15

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter number");
            int num = sc.nextInt();
            int result = 1;

            for (int i = 1; i <= num; i++) {
                result = result * i;
            }

            System.out.println(result);

        }
    }

