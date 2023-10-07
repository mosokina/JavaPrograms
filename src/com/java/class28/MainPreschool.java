package com.java.class28;

import java.util.Scanner;

public class MainPreschool {

    public static void main(String[] args) {

        System.out.println("In the  group \"Infants\" : \n");

        Infants maria = new Infants("Maria", 'f', 0.5, "");
        System.out.println("At age " + maria.getAge() + " we recommend " + maria.getFood());
        maria.sleepSchedule();
        System.out.println();

        Infants dima = new Infants("Dima", 'm', 0.8, "");
        System.out.println("At age " + dima.getAge() + " we recommend " + dima.getFood());
        dima.sleepSchedule();
        lineOfEquals();

        System.out.println("Welcome to the group \"Toddler\" : \n\nIs your child a potty trained?");
        Scanner s = new Scanner(System.in);
        String answer = s.nextLine();
        Toddler vlad = new Toddler("Vlad", 'm', 2.2,answer);
        vlad.ifPottyTrained(answer);
        lineOfEquals();
        Kids yulia = new Kids("Yulia", 'f', 4.8);
        System.out.println("Welcome to the group \"Kids\" : \n\nDoes " + yulia.getName() + " have any allergies?");

        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();

        yulia.anyAllergies(ans);
        lineOfEquals();
    }

    public static void lineOfEquals() {
        System.out.println("===============================================");
    }
}
