package com.java.class15;

public class HWSum1to50NumbersDividedBy5or3 {
    //2. Java program to print the sum of 1 to 50 numbers which are divisible by 5 or by 3
    public static void main(String[] args) {
        int result = 0;

        for (  int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);// optional, but will be better to see what is happening
                result = result + i;
            }
        }
        System.out.println(result);
        }
    }

