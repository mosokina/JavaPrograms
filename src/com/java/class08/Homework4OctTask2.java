package com.java.class08;

import java.util.Scanner;

public class Homework4OctTask2 {

    public static void main(String[] args) {

        //Task#2 : Write a program to calculate the final bill of the customer
        // after giving an appropriate discount based on the amount as follow:
        //
        //If total amount equal or above 10000 then give 20% discount
        //If total amount equal or above 5000 then give 15% discount
        //If total amount equal of above 2000 then given 10% discount 
        //If total amount equal of above 1000 then given 5% discount
        //If total amount less than 1000 then 0% discount

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter your bill: ");
        double bill = sc2.nextDouble();

        double  finalBill20 = bill - (bill * 0.20);
        double  finalBill15 = bill - (bill * 0.15);
        double  finalBill10 = bill - (bill * 0.10);
        double finalBill05 = bill - (bill * 0.05);

        if (bill >= 10_000) {
            System.out.println("Your final bill with discount is: " + finalBill20 ) ;
        } else if (bill >= 5_000) {
            System.out.println("Your final bill with discount is: " + finalBill15 );
        } else if (bill >= 2_000) {
            System.out.println("Your final bill with discount is: " + finalBill10 );
        }  else if (bill >= 1_000) {
            System.out.println("Your final bill with discount is: " + finalBill05 );
        }  else {
            System.out.println("Your final bill with discount is: " + bill);
        }
        
    }
}
