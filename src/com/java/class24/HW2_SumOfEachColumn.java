package com.java.class24;

public class HW2_SumOfEachColumn {
    //2. Write a program to print the sum of each COLUMN from a 2D array
    //Example
    //Array:
    //{23, 44, 21},
    //{45, 42, 31},
    //{73, 14, 0}
    //Output :  141, 100 ,52

    public static void main(String[] args) {
        int info[][] = {
                {23, 44, 21},
                {45, 42, 31},
                {73, 14, 0}};

        for (int i = 0; i < info.length; i++) {
            int sum = 0;
            for (int j = 0; j < info.length; j++) {
                sum = sum + info[j][i]; //it will store number from 1st column
                //then+ num from second, then from 3rd
                // 23+45+73
                //44+42+14
                //21+31+0

            }
            System.out.println(sum); //will print sum of columns
        }

    }
}