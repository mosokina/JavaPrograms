package com.java.class15;

public class HWSumOfEvenNum1to10 {
    public static void main(String[] args) {
        //1. Java program to print the sum of even numbers from 1 to 10
        int sum = 0;
        int i = 1;
        while (i <= 10){
            if (i%2 == 0)
                sum = sum + i;
                i++;
            }
            System.out.println(sum);
        }
    }

