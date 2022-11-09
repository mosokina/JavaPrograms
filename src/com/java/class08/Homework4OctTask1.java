package com.java.class08;

import java.util.Scanner;

public class Homework4OctTask1 {
    public static void main(String[] args) {
        //Task#1 : Write a program to take number from user and print if it's divisible by 5 or not

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int nbr = sc2.nextInt();

        if (nbr % 5 == 0){
            System.out.println("Your number is divisible by 5.");

        } else {
            System.out.println("Your number is not divisible by 5.");
        }
    }
}
