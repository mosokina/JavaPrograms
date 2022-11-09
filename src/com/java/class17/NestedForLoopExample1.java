package com.java.class17;
//Hello Hello Hello
//Hello Hello Hello
//Hello Hello Hello
//Hello Hello Hello
//Hello Hello Hello
public class NestedForLoopExample1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { //we will have 5 rows, because i<=5
            for (int j = 1; j <= 3; j++) { //in each row we will have 3 Hello
                System.out.print("Hello ");// Hello will be print in the same line, because print
            }
            System.out.println(); //printLN = enter, will jump to the next row
        }

    }
}
