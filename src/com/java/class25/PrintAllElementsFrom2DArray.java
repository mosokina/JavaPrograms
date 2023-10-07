package com.java.class25;

//print all elements from 2d array

public class PrintAllElementsFrom2DArray {
    public static void main(String[] args) {
        int data[][] = {
                {23, 44, 21},
                {45, 42, 31},
                {73, 14, 0}};

        for (int row []: data) { //choose 1st row
            for (int num : row){ //choose numbers from choosen row - 1st row
            System.out.print(num + " ");//print all num from 1st row
            }
            System.out.println(); //jump to next row
        }
    }
}
//Output
//23 44 21
//45 42 31
//73 14 0