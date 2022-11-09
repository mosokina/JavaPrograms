package com.java.class16;

import java.util.Scanner;

public class GreatestDigit {
    ////        Write a program to print
    ////        greatest digit from the
    ////        given number
    ////
    ////        input - 367678
    ////        output - 8
    ////
    ////        input - 872439
    ////        output - 9

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();
        int max = num %10; // finding the last digit 7 and compare with it

        while (num != 0){ //true
            int lastDigit = num%10; //7 , 4 , 5, 6 taking last digit

            if (max < lastDigit){ // 7<4 false 7<5 false until it's TRUE
                max = lastDigit; //store number in max
            }
            num = num/10;//4654, 465 , 65, 4 removing last digit
        }
        System.out.println(max);
    }
}
