package com.java.class09;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeworkOct5Task2 {
    public static void main(String[] args) {

        //Task #2: Write a program to reads power consumed in units and print the amount to be paid by the customer
        //  Consumption   Rate of Units Charges are as follows
        //  ------------------------------------------------------
        //  If unit is 0-200       Rs.0.50 per unit
        //  If unit is 201-400     Rs.100 plus Rs.0.65 per unit
        //  If unit is 401-600     Rs.230 plus Rs.0.80 per unit
        //  -------------------------------------------------------

        System.out.println("Please enter units of power: ");
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int unit = sc.nextInt();
        double result200 = (double) unit*0.50;
        double result400 = (double) unit*0.65 + 100;
        double result600 = (double) unit*0.80 + 230;

        if (unit >= 0 && unit <= 200){
            System.out.println(df.format(result200) + " will be your total");

        } else if (unit >= 201 && unit <= 400){
            System.out.println(df.format(result400)  + " will be your total");

        } else if (unit >= 401 && unit <= 600){
            System.out.println(df.format(result600) + " will be your total");

        }else{
            System.out.println("Please enter valid units of power");
        }

    }
}
