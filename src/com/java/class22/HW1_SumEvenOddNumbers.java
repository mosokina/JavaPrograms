package com.java.class22;

public class HW1_SumEvenOddNumbers {
    //  1. Write a program to find the sum of even and odd numbers
    //Example
    //Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
    //Output : Sum Of Even - 134, Sum Of Odd - 206
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};
        int odd = 0;
        int even = 0;
        for (int i = 0; i< data.length; i ++){
            if (data[i] % 2 == 0) {
                even = even + data[i];

            } else {
                odd = odd + data[i];

            }
        }
        System.out.println("Odd sum is: " +odd);
        System.out.println("Even sum is: " + even);

    }
}
