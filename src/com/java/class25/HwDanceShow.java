package com.java.class25;

import java.util.Scanner;

public class HwDanceShow {
    public static void main(String[] args) {
        // Create and Initialize Object
        HwDancer num1 = new HwDancer();
        HwDancer num2 = new HwDancer();

        num1.name = "Monica";
        num1.age = 8;
        num1.style = "Contemporary";
        num1.numberInShow = "45";
        num1.numberInTeam = 1;

        num2.name = "Monica and James";
        num2.age = 5;
        num2.style = "Hip Hop";
        num2.numberInShow = "18";
        num2.numberInTeam = 2;

        num1.teamCategory(num1.name, num1.numberInTeam);
        System.out.println();

        num1.timeInShow(num1.numberInShow, num1.age, num1.style);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your points, Judge #1: ");
        double judge1 = sc.nextDouble();
        System.out.println("Please enter your points, Judge #2: ");
        double judge2 = sc.nextDouble();
        System.out.println("Please enter your points, Judge #3: ");
        double judge3 = sc.nextDouble();

        num1.totalPoints(judge1,judge2,judge3);

        System.out.println("-------------------------------------");

        num2.teamCategory(num2.name, num2.numberInTeam);
        System.out.println();
        num2.timeInShow(num2.numberInShow, num2.age, num2.style);
        System.out.println();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter your points, Judge #1: ");
        double j1 = sc1.nextDouble();
        System.out.println("Please enter your points, Judge #2: ");
        double j2 = sc1.nextDouble();
        System.out.println("Please enter your points, Judge #3: ");
        double j3 = sc1.nextDouble();
        num1.totalPoints(j1,j2,j3);
    }
}
