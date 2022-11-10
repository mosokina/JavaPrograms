package com.java.class24;

public class SumOfElementRowWise {
    // Write a program to print sum of each row from 2D array
    // output
    // 88
    // 118
    // 87
    public static void main(String[] args) {
        int info[][] = {
                {23, 44, 21},
                {45, 42, 31},
                {73, 14, 0}};

        for (int i = 0; i < info.length; i++) {

            // visiting all rows
            //we need to print sum after each row

            int sum = 0; //we need to keep it at 0, so it will not add other rows

            for (int j = 0; j < info[i].length; j++) { //each element in row
                sum = sum + info[i][j];
            }
            System.out.println(sum);
        }
    }
}
