package com.java.class07;

import java.util.Scanner;

public class LadderIfElseExample {

    public static void main(String[] args) {

        // Write a program to print day name based on day of week

                // Input
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Please enter any day of week(0-6): ");
                int dayOfWeek = sc2.nextInt();

                if(dayOfWeek==0){
                    System.out.println("Sunday");
                }else if(dayOfWeek==1){
                    System.out.println("Monday");
                }else if(dayOfWeek==2){
                    System.out.println("Tuesday");
                }else if(dayOfWeek==3){
                    System.out.println("Wednesday");
                }else if(dayOfWeek==4){
                    System.out.println("Thursday");
                }else if(dayOfWeek==5){
                    System.out.println("Friday");
                }else if(dayOfWeek==6) {
                    System.out.println("Saturday");
                }else{
                    System.out.println("ERROR. Pleas enter a valid number. ");
        }
    }
}
