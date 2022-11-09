package com.java.class08;

import java.util.Scanner;

// Write a program to take marks from the user and print the grade as follow
//        Mark is between 90 to 100 then print A+
//        Mark is between 80 to 89 then print A
//        Mark is between 70 to 79 then print B+
//        Mark is between 60 to 69 then print B
//        Mark is between 50 to 59 then print C+
//        Mark is between 40 to 49 then print C
//        Mark is below 40 then print Fail

public class LadderIfElseHomeworkExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter your mark: ");
        int marks = sc.nextInt();

        if (marks > 100) {
            System.out.println("Please enter valid marks (0-100)");
        } else if (marks < 0) {
                System.out.println("Please enter valid marks (0-100)");
        } else if (marks >= 90) {
            System.out.println("A+");
        }  else if (marks >= 80) {
            System.out.println("A");
        }  else if (marks >= 70) {
            System.out.println("B+");
        }  else if (marks >= 60) {
            System.out.println("B");
        }  else if (marks >= 50) {
            System.out.println("C+");
        }  else if (marks >= 40) {
            System.out.println("C");
        }else{
            System.out.println("Fail"); //if number is 0

        }
    }
}
