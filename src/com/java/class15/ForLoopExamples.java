package com.java.class15;

public class ForLoopExamples {
    public static void main(String[] args) {

        //WHILE
        // loop 1 to 5
        int i = 1;//initialization

        while (i <= 5) { //condition
            System.out.println(i);
            i++; //increment/ decrement
        }

        System.out.println("");
        // FOR
        // loop 5 to 1

        for (int a = 5; a >= 1; a--) { //initialization,condition,increment/ decrement
            System.out.println(a);

        }

        System.out.println("");
        //// Write a Java program to Print Pattern 1 10 2 9 3 8 4 7 5 6
        int j = 10;
        for (int g = 1, h = 10; g <= 5; g++, h--) {

            System.out.println(g);
            System.out.println(h);

        }
        System.out.println("");
        //Write a Java program to Print Pattern 1 10 2 9 3 8 4 7 5 6
        for (int q = 1; q <= 5; q++) {

            System.out.println(q);
            System.out.println(11 - q);
        }


    }
}




