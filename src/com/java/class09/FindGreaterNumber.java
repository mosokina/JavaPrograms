package com.java.class09;

import java.util.Scanner;

public class FindGreaterNumber {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc1.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc1.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc1.nextInt();


        if (num1 >num2) { //every “if” has to have “else"

            if (num1 > num3) {
                System.out.println(num1 + " is greatest");

            } else {
                System.out.println(num3 + " is greatest");
            }
        }else{
            if (num2 >num3){
                System.out.println(num2 + " is greatest");
            }else{
                System.out.println(num3 + " is greatest");
            }
        }

    }
}

