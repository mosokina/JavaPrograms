package com.java.class09;

import java.util.Scanner;

public class HomeworkOct5Task1 {
    public static void main(String[] args) {
        //Task #1: Write a program to get a year from the user and check whether it's a leap year or not
        //Example
        //Input  : Year = 2000
        //Output : Leap year

        System.out.println("Please enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year <=0){
            System.out.println("Please enter a valid year");
        } else if (year%4 == 0) {
            System.out.println(year + " is a leap year");
        }  else {
            System.out.println(year + " is NOT a leap year");

        }
    }
}
