package com.java.class09;

import java.util.Scanner;

public class LadderIfElseExample {
    //Write a program to get age and weight from user and print massage based on following conditions:
    //1. user age >= 18 and weight >=50 then they are eligible for blood donation
    //2. If user age  < 18 and weight >50 - You are too young to donate blood.
    //3. >18 and <50 - You are under weight to donate blood. Pleas eat more
    //4. If age <18 and  <50  - You are not eligible to donate blood

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your weight: ");
        int weight = sc.nextInt();

        if (age >= 18 && weight >= 50) {
            System.out.println("You re eligible for blood donation.");
        } else if (age < 18 && weight > 50) {
            System.out.println("You are too young to donate blood.");
        } else if (age >= 18 && weight < 50) {
            System.out.println("You are under weight to donate blood. Pleas eat more.");
        } else {
            System.out.println("You are not eligible to donate blood");

        }

        // 2nd approach - nested if-else
        if(age >=18){
            if(weight >=50){
                System.out.println("You're eligible");
            }else{
                System.out.println("you're underweight");
            }
        }else{
            if(weight >=50){
                System.out.println("you're too young to donate blood");
            }else{
                System.out.println("you're not eligible");
            }
        }
    }
}