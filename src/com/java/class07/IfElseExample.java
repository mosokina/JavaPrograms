package com.java.class07;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {
    //take numbers from user and find maximum

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");

        int nbr1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int nbr2 = sc.nextInt();

        if (nbr1 > nbr2) {
            System.out.println("This number is greater: " + nbr1);
        }else{
            System.out.println("This number is greater: " + nbr2);
        }

    }
}
