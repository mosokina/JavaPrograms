package com.java.class07;

import java.util.Scanner;

public class IfElseExample2 {

    public static void main(String[] args) {
        // take age from user and print weather they are eligible for driving  licence or not

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Please enter your age: ");

        int age = sc1.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible for driving! ");
        }else{
            System.out.println("Sorry, you are not eligible for driving. ");


        }
    }
}
