package com.java.class22;

public class HW2_FindGreatestNumberFromArray {
    //  2. Write a program to find greatest number from an array
    //Example
    //Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
    //Output : Maximum - 75
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};
     int largest = 0;

     for (int i = 0; i < data.length; i++)
         if (data[i] > largest) {
             largest = data[i];
         }
        System.out.println("Largest number is: " + largest);
    }
                }
