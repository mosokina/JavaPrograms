package com.java.class23;

public class FindDuplicatesNumbers {
    //  3. Write a program to find all duplicates number from the array (Tricky, do enough brainstorming before solving)
    //Example
    //Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
    //Output : Duplicate numbers - 23, 44
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 27, 35, 75, 44, 25};



        for (int i = 0; i < data.length-1; i++) {
            //do Not need to compare last number -25,
            // it's already compared will all numbers before

            for (int j = i + 1; j < data.length; j++) {
                //j will start from next num from i - j+1
                // need  to include the last number to compare with i
                if (data[i] == data[j]) {

                   System.out.println(data[i]);
                }
            }
        }

    }
}