package com.java.class24;

public class HW1_UniqueDuplicateFromArray {
    //1. Write a program to find all duplicates number
    // from the array (Implement this program to get unique numbers in the output)
    //Try to brainstorm and create a logic, use pen and paper to write down what you do
    // and find the next step, You can also work in a group of 3 to 4 for the brainstorming
    //Example
    //Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
    //Output : Duplicate numbers - 23, 44, 35
    public static void main(String[] args) {


        int [] info = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};


        for (int i = 0; i < info.length; i++) {
            int duplicate = 0;

            for (int j = i + 1; j < info.length; j++) {

                if (info[i] == info[j]){
                duplicate++;
            }
        }
        if (duplicate ==1){
            System.out.println(info[i]);

            }
        }
    }
}