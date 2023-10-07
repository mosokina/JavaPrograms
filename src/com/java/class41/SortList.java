package com.java.class41;

import java.util.ArrayList;
import java.util.List;

// Expected output - 10 20 45 50
public class SortList {
    public static void main(String[] args) {

        //Expected output - 10 20 45 50
        List<Integer> listOfData = new ArrayList<>();
        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        int minIndex = 0;

        for (int i = 0; i < listOfData.size()-1; i++) {
            minIndex = getMinimum(listOfData, i);

            //SWAP the position of data in ArrayList
            int temp = listOfData.get(i);
            listOfData.set(i, listOfData.get(minIndex));
            listOfData.set(minIndex, temp);
        }

        System.out.println(listOfData);
    }

    public static int getMinimum(List<Integer> listOfData, int startPosition){
        //Finding the smallest in the ArrayList

        int min = listOfData.get(0);
        int minIndex = 0;
        for (int j =startPosition ; j < listOfData.size(); j++) {
            if (listOfData.get(j) < min) {
                min = listOfData.get(j);
                minIndex = j;
            }
        }
        return minIndex;
    }
}
