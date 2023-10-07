package com.java.class42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();
        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        // Using Index Based For Loop
        for (int i = 0; i < listOfData.size(); i++) {
            System.out.println(listOfData.get(i));
        }
        System.out.println("_______________________");
        // For Each Loop
        for (int item : listOfData) {
            System.out.println(item);
        }
        System.out.println("_______________________");

        // Using Iterator applicable for Collection only
        //Object of Iterator interface

        Iterator<Integer> itr = listOfData.iterator();
        System.out.println(itr.next()); //to print each
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        //System.out.println(itr.next()); //NoSuchElementException

        System.out.println("_______________________");
        //print all the data with while loop
        Iterator<Integer> itr1= listOfData.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}
