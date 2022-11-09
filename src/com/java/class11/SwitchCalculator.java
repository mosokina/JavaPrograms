package com.java.class11;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc1.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc1.nextInt();

        System.out.println("Please enter your operation: ");
        String operation = sc1.next();


        switch (operation.toLowerCase()) { //does not matter if user will use upper or lower letters
            case "add"://we use LowerCase in our task
            case"+":
            System.out.println(num1 + num2);
                break;

            case "sub":
            case"-":
                System.out.println(num1 - num2);
                break;

            case "mul":
            case"*":
                System.out.println(num1 * num2);
                break;

            case "div":
            case"/":
                System.out.println(num1 / num2);
                break;

            case "mod":
            case "%":
                System.out.println(num1 % num2);
                break;

            default:
                System.out.println("please enter the valid operation");
        }
    }
}
