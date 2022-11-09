package com.java.class06;

import java.util.Scanner;

public class Homework28SeptTask2 {

    public static void main(String[] args) {
        //Task 2. Write a program to get principle, rate of interest and number of years from the user and calculate simple interest
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Please enter yoyr principle: "); //100
        int principle = sc1.nextInt();
        System.out.println("Please enter your rate of interest: "); //0.05
        double rate = sc1.nextDouble();
        System.out.println("Please enter number of years: ");//3
        int years = sc1.nextInt();

        int simpleInterest = (int) (principle * rate * years);// 15

        System.out.println(" Your simple interest is: " + simpleInterest);

    }
}
