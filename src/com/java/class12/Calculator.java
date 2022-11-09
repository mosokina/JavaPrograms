package com.java.class12;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter first number");
        int num2 = sc.nextInt();

        System.out.println("Please enter your operation: ");
        String operation = sc.next();

        switch (operation.toLowerCase()){
            case "add":
            case "+":
                add(num1, num2);
                break;

            case "sub":
            case "-":
                sub(num1, num2);
                break;

            case "mul":
            case "*":
                mul(num1, num2);
                break;

            default:
                System.out.println("Please choose right operation");
        }
    }


   static void add(int a, int b){
        System.out.println(a + b);
    }
    static void sub(int a, int b){
        System.out.println(a-b);
    }
    static void mul(int a, int b){
        System.out.println(a*b);
    }

}
