package com.java.class08;

import java.util.Scanner;

public class FindGreatestNumberOutOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc4 = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc4.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc4.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc4.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 +" is greatest");
        }else if(num2 > num3){
            System.out.println(num2 +" is greatest");
        }else{
            System.out.println(num3 +" is greatest");

        }

    }
}
