package com.java.class16;

import java.util.Scanner;

public class HW1SumOfEachDigit {
    //1. Write a program to print sum of each digits from the given number
    //Input - 12345
    //Output - 15
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");

        int num = sc.nextInt(); //Example: 12345
        int result = 0; //1,2,3,4,5 will be stored in result

        while (num > 0) { //when condition FALSE - we will get out from the loop and print
            int lastDigit = num % 10; // to get last digit - 5
            result = result + lastDigit; // store that digit in result= 0+5 =5

            num = num / 10; //to remove last digit, now num = 1234 and back to while
        }
        System.out.println("The sum of all digits is: " + result);
        }
    }

