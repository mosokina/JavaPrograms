package com.java.class15;

import java.util.Scanner;

public class HWReverseNumInSepLine {
    //4. Write a program to print each digit of the number into a separate line in reverse order
    //Example
    //Input - 3575
    //Output
    //5
    //7
    //5
    //3
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();

            while (num != 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}
