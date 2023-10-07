package com.java.class24;

import java.util.Arrays;

public class HW3_SortElementsAscendingOrder {
    //3. Program to sort the elements of an array in ascending order
    // (Same from the previous homework)
    //Example
    //Input : 5, 2, 8, 7, 3, 6
    //Output : Duplicate numbers - 2, 3, 5, 6, 7, 8

    public static void main(String[] args) {
        int data[] = {5, 2, 8, 7, 3, 6};

        for (int i =0; i< data.length; i++){
            for (int j = i+1; j< data.length; j++){
                if (data[i] > data[j]){
                    int newSpace = data[i];// moving value of i to newSpace
                    data[i] = data[j]; //moving value of j to i spot
                    data[j] = newSpace; //original value of i taking space after smaller j
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
//Otput
// [2, 3, 5, 6, 7, 8]