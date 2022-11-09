package com.java.class07;

import java.util.Scanner;

public class HomeworkOct3Task2 {
    public static void main(String[] args) {

        //2. Write a program to print the number of days in a given month
        //Example1
        //input is 3
        //output is 31 days
        //Example2
        //Input is 2
        //output is 28 days

        Scanner sc6 = new Scanner (System.in);
        System.out.println("Please enter month's number: ");

        int nbrOfMonth = sc6.nextInt();

        if(nbrOfMonth == 1|| nbrOfMonth == 3||nbrOfMonth == 5||nbrOfMonth == 7||nbrOfMonth == 8 ||nbrOfMonth == 10||nbrOfMonth == 12){
            System.out.println("In this month  - 31 days. ");
        }else if(nbrOfMonth == 2){
            System.out.println("In this month - 28 days. ");
        }else if(nbrOfMonth == 4||nbrOfMonth == 6 ||nbrOfMonth == 9||nbrOfMonth == 11){
            System.out.println("In this month  - 30 days. ");
        }else {
            System.out.println("ERROR. Pleas enter a valid month's number. ");


        }
    }
}
