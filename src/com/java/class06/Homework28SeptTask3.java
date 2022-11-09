package com.java.class06;

import java.util.Scanner;

public class Homework28SeptTask3 {
    public static void main(String[] args) {

        Scanner sc2 = new Scanner(System.in);
        // Task 3 Write a program to take total bill amount and discount percentage from user
        // and print value of final bill amount after discount

        System.out.println("Please enter total bill: ");
        double totalBill = sc2.nextDouble(); //75.32

        System.out.println("Pleas enter discount percentage: ");
        int discount = sc2.nextInt(); //50


        double finalBill = (totalBill * (double)discount/100); //37.66
        System.out.println("Your final bill is: " + finalBill);



    }
}
