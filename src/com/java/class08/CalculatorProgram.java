package com.java.class08;

import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc1.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc1.nextInt();

        System.out.println("Please choose your operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int operation = sc1.nextInt();

        int addition = num1 + num2;
        int substraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        if (operation == 1){
            System.out.println( addition );
          } else if (operation == 2) {
            System.out.println(substraction);
        } else if (operation == 3) {
            System.out.println(multiplication);
        } else if (operation == 4) {
            System.out.println(division);

        }

    }

    }

