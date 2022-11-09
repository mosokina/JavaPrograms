package com.java.class21;

import java.util.Scanner;

public class HW3_StringIsPalindromeOrNot {

    //3. Java Program to determine whether a given string is palindrome or not by ignoring
//    the case of characters and white spaces
//    Example
//    Input - Was it a car or a cat I saw
//    Output - Palindrome (edited)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str = sc.nextLine().replace(" ","");
        String revStr = "";

        for (int i = 0; i <str.length(); i++) {
            revStr = revStr + (str.charAt(str.length()-1 -i));
        }

        if (str.equalsIgnoreCase(revStr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}



