package com.java.class23;

public class HW3_SortElementsInAscendingOrder {
//    3. Program to sort the elements of an array in ascending order (Tricky, do enough brainstorming before solving)
//    Example
//    Input : 5, 2, 8, 7, 3, 6
//    Output : Duplicate numbers - 2, 3, 5, 6, 7, 8
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};

        for (int i = 0; i < data.length - 1; i++) {

            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    System.out.println(data[i]);
                    break;
                }
            }

        }
    }
}
