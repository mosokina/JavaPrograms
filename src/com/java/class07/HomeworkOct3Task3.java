package com.java.class07;

import java.util.Scanner;

public class HomeworkOct3Task3 {

    public static void main(String[] args) {

//        Write a program to take marks from the user and print the grade as follow
//        Mark is between 90 to 100 then print A+
//        Mark is between 80 to 89 then print A
//        Mark is between 70 to 79 then print B+
//        Mark is between 60 to 69 then print B
//        Mark is between 50 to 59 then print C+
//        Mark is between 40 to 49 then print C
//        Mark is below 40 then print Fail

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Please enter your grade: ");

        int grade = sc4.nextInt();

        if (grade > 100) {
            System.out.println("You did outstanding! ");
        } else if (grade >= 90) {
            System.out.println("A+ ");
        } else if (grade >= 80) {
            System.out.println("A ");
        } else if (grade >= 70) {
            System.out.println("B+");
        } else if (grade >= 60) {
            System.out.println("B");
        } else if (grade >= 50) {
            System.out.println("C+");
        } else if (grade >= 40) {
            System.out.println("C");
        } else {
            System.out.println("You are fail. ");
        }
    }
}
