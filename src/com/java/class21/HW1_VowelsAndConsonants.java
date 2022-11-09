package com.java.class21;

import java.util.Scanner;

public class HW1_VowelsAndConsonants {
    //1. Java Program to count the total number of vowels and consonants in a string
//    Example
//    Input - Today is Saturday
//    Output - Total Vowels - 6, Total Consonants -  9
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str = sc.nextLine().toLowerCase().replace(" ","");

        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u') {
                vowels++;

            } else {
                consonants++;

            }
                   }
        System.out.print("Total vowels - " + vowels);
        System.out.println(", total consonants - " + consonants);
    }
}
