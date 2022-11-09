package com.java.class05;

import java.util.Scanner;

public class ScannerTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = sc.nextInt();


        System.out.println("You have spent: " + age * 12 + " months on Earth");
        System.out.println("You have spent: " + age * 365 + " days on Earth");
        System.out.println("You have spent: " + age * 525600 + " minuts on Earth");

    }
}
