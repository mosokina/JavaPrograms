package com.java.class42;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();
        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        System.out.println("new ArrayList<>() - " + listOfData + " as we typed"); //[10, 50, 20, 45]

        Set<Integer> setOfData = new HashSet<>();

        setOfData.add(45);
        setOfData.add(50);
        setOfData.add(20);
        setOfData.add(10);
        System.out.println("new HashSet<>() - " + setOfData + " randomly");//randomly once [50, 20, 10, 45]

        // You can retrieve data from set by using for loop only
        System.out.println("for(int num : setOfData) - ");
        for(int num : setOfData) {
            System.out.println(num);

        }
        Set<Integer> treeSetOfData = new TreeSet<>(setOfData);
            System.out.println("new TreeSet<>(setOfData) - " + treeSetOfData + " in natural order");

        Set<Integer> linkedHashSetOfData = new LinkedHashSet<>(setOfData);
        System.out.println("new LinkedHashSet<>(setOfData) - " + linkedHashSetOfData + " in order, that was generated");

    }
    }
