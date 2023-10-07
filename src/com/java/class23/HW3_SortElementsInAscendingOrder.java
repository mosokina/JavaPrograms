package com.java.class23;

import java.util.Arrays;

public class HW3_SortElementsInAscendingOrder {
//    3. Program to sort the elements of an array in ascending order
//    (Tricky, do enough brainstorming before solving)
//    Example
//    Input : 5, 2, 8, 7, 3, 6
//    Output : Duplicate numbers - 2, 3, 5, 6, 7, 8
    public static void main(String[] args) {
        int data[] = {5, 2, 8, 7, 3, 6};

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {


                if (data[i] > data[j]) {
                    int num = data[i]; //storing value of i in num ( i ->num)
                    data[i] = data[j]; //storing value of j in empty spot i (j ->i)
                    data[j] = num; //now value of i in num ( num, which is i ->j)
                }
            }
        }
              System.out.println(Arrays.toString(data));

                }

            }
 //output
//[2, 3, 5, 6, 7, 8]