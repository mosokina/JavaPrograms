package com.java.class05;

import java.util.Scanner;

public class ScannerTask1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter second number: ");
        int b = sc.nextInt();
        System.out.println("Please enter third number: ");
        int c = sc.nextInt();

        double d;
        d = (a+b+c)/3.0;

        System.out.println("Your average of all numbers is: " + d);


    }
}
