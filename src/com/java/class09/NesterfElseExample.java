package com.java.class09;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class NesterfElseExample {
    public static void main(String[] args){

    // Get salary and age from user
// 1. If age is less than 18 then print you're not eligible
// 2. If age is more than or equal 18 and salary is less than 5000
// then print 'Sorry, you need work hard to get credit card'
// 3. If age is more than or equal 18 and salary is greater than
// or equal 5000 then print you're eligible
// 4. If age is more than or equal 18 and salary is greater than
// or equal to 20000 then print you'll get free credit card

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = sc1.nextInt();

        if (age >= 18) {

            System.out.println("Please enter your salary: ");
            int salary = sc1.nextInt();

            if (salary < 5000) {
                System.out.println("Work Hard");
            } else if (salary >= 2000) {
                System.out.println("Free card");
            } else if (salary >= 5000) {
                System.out.println("You are eligible");
            }
        }else{
            System.out.println("You are not eligible.");
        }
      }
    }

