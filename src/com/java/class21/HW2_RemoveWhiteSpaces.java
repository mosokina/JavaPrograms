package com.java.class21;

import java.util.Scanner;

public class HW2_RemoveWhiteSpaces {

//2. Java Program to remove all the white spaces from a string
//            Example
//    Input - Today is Saturday
//    Output - TodayisSaturday
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your string: ");
    String str = sc.nextLine();

    System.out.println(str.replaceAll("\\s",""));
    //where \\s is a single space in unicode

}
}
