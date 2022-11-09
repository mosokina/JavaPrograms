package com.java.class12;

import java.util.Scanner;

public class FindReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number (100 -999): ");

        int num = sc.nextInt(); //Example - 874
        int rev = 0;

        //Retrieve last digit fom the number
        int lastDigit = num %10; //last digit - 4
        //Combine last digit with previous value of reverse number
        rev = rev*10 + lastDigit; //0*10 +4 = 4
        //Removing last digit from the number
        num = num/10;//num = 87

        lastDigit = num %10; //last digit = 7
        rev = rev*10 + lastDigit;  // 4*10 + 7 =47
        num = num/10;// num = 8

        lastDigit = num %10;//last digit = 8
        rev = rev*10 +lastDigit;//47*10 + 8 = 478
        num = num/10;// num =0

        System.out.println(rev);//478
    }
}
