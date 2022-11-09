package com.java.class20;

import java.util.Scanner;

public class HW1_PrintFirstLettersFromFirstLastName {

    public static void main(String[] args) {
//    Write a program to take the full name from the user and print
//    the first letter of the first name and last name
//    Example
//    Input - Thomas Joe
//    Output  - T.J
//    Another Example
//    Input - Charlie Kyle
//    Output - C.K

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first and last name: ");
        String name = sc.nextLine();

        int secondLetter = (name.indexOf(' ') +1);
        //store the number of 2ndLetter after space
        System.out.println(name.charAt(0) +"."+name.charAt(secondLetter));
                                                //convert int to letter

    }
}

