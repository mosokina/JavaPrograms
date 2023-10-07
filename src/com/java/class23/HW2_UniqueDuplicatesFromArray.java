package com.java.class23;

public class HW2_UniqueDuplicatesFromArray {
    //2. Write a program to find all duplicates number from the array
// (Implement this program to get unique numbers in the output)
//    Example
//    Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
//    Output : Duplicate numbers - 23, 44, 35
    public static void main(String[] args) {

        int data[] = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};
        System.out.println("Unique numbers from the array are:  ");
        findUniqueNumber(data);

    }

    static void findUniqueNumber(int data[]) {

        for (int i = 0; i < data.length; i++) {

            int duplicate = 0; //empty int where to store all duplicates

            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    duplicate++;
                }
            }
            if (duplicate == 1) {
                    System.out.println(data[i]);
                }
            }
        }
    }

    //output
//    Unique numbers from the array are:
//        44
//        35
//        23


