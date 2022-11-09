package com.java.class15;

public class Sum1to5UsingForLoop {

    // Write a program to print sum of 1 to 5 // Output - 15
            public static void main(String[] args) {
            int result = 0; //1,2,3,4,5 will be stored in result

            for (int i = 1; i <= 5; i++) {
                result = result + i; //0+1= 1 will be stored in result
            }

            System.out.println(result);

        }
    }

