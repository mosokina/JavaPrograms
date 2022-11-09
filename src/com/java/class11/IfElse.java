package com.java.class11;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        int number = sc3.nextInt();

        if (number == 5) {
            System.out.println("Five");
        }else if (number == 4){
            System.out.println("Four");
        }else if (number == 3){
            System.out.println("Three");
        }else if (number == 2){
            System.out.println("Two");
        }else if (number == 1) {
            System.out.println("One");
        }else if (number == 0) {
            System.out.println("Zero");
        }else{
            System.out.println("Please enter valid number 0-5. ");
        }
    }
}
