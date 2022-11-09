package com.java.class18;

// 1.  Write a program to print all the prime numbers from 1 to 100
public class HW1_Prime1to100 {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {

            int count = 0;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
