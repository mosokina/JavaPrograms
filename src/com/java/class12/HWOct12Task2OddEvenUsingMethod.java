package com.java.class12;

import java.util.Scanner;

public class HWOct12Task2OddEvenUsingMethod {
//2.Write a program to check given number is odd or even using function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();

        System.out.println("Your number is: "); oddEven(num);
    }

    static void oddEven(int nbr) {
        if (nbr % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
            }

     }
