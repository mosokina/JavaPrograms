package com.java.class16;

import java.util.Scanner;

//Write the program if given number is prime or not
//Input - 13
//Output - Prime
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = sc.nextInt();
        int count = 0;


        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
                System.out.println("Divisors is: " + i);

            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

