package com.java.class23;

public class HW1_TwoDimentionArray {
    public static void main(String[] args) {
        //1. Go through and write the same code by yourself from the file TwoDimentionArray.java

        //Declaration of 2D array
        int data[][];
        //Declaration and initialization of 2D array
        int nums[][] = new int[2][3];
        //Declare and assign in 1 line
        int info[][] = {{1,2,3}, {4,5,6}, {7,8,9}}; //it's [3][3]

        //Find num of rows in the array
        System.out.println(nums.length); //output 2
        //Find numbers of colomn in a row
        System.out.println(nums[0].length);//output 3

        //Print data at particular
        System.out.println(info[0][0]); //output 1

        //Print all data from 2D array using index based for loop
        for (int i =0; i<info.length; i++){
            for (int j =0; j< info.length; j++){
                System.out.print(info[i][j] +" ");
            }
            System.out.println();
        }

    }

}
