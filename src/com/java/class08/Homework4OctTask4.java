package com.java.class08;

import java.util.Scanner;

public class Homework4OctTask4 {
    public static void main(String[] args) {
        //Task#4 - Write a program to check given character is a vowel or not
        //Vowel characters are - a, e, i, o, u

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Please enter character. ");
        char charFromUser = sc4.next().charAt(0);

        if (charFromUser == 'a' || charFromUser == 'e' || charFromUser == 'i' || charFromUser == 'o' ||charFromUser== 'u') {

            System.out.println("The character is a vowel. ");
        }else{

            System.out.println("Tha character in not a vowel. ");
        }

    }
}
