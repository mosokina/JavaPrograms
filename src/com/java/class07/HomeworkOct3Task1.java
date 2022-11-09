package com.java.class07;

import java.util.Scanner;

public class HomeworkOct3Task1 {

    public static void main(String[] args) {
        //1. Write a program to print a given number that is positive, negative, or zero

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Please enter your number: ");

        int nbr = sc5.nextInt();

        if (nbr == 0 ) {
            System.out.println("Your number equal to zero.");
       }else if (nbr > 0 ){
            System.out.println("Your number is positive.");
       }else{
         System.out.println("Your number is negative.");
}
}
}