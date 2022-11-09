package com.java.class08;

import java.util.Scanner;

public class Homework4OctTask3 {
    public static void main(String[] args) {

//        Task#3 - Write a program to print messages based on the rating of the company
//        For Example:
//        rating is 5 then print Very Good
//        rating is 4 then print Good
//        rating is 3 then print Average
//        rating is 2 then print Poor
//        rating is 1 then print Very Poor

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Please, enter the rating of your company: ");
        int rating = sc3.nextInt();

        if (rating == 5) {
            System.out.println("The rating is Very Good");
        }else if (rating == 4){
            System.out.println("The rating is Good");
        }else if (rating == 3){
            System.out.println("The rating is Average");
        }else if (rating == 2){
            System.out.println("The rating is Poor");
        }else if (rating == 1) {
            System.out.println("The rating is Very Poor");
        }else{
            System.out.println("Please enter valid rating 1-5. ");
        }
    }
}
