package com.java.class16;

public class HW2ProgramToFindSum1to10 {
    //  2.  Java program to find result of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
    public static void main(String[] args) {
        int sum =0;


        for (int a = 10, b = 1; a>=6 && b <= 5; a--, b++ ){
            sum = sum + a + b;

        }
        System.out.println("The summary of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5 = " + sum);
    }
}
