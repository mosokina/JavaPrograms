package com.java.class10;

public class IfElseRevisionExample1 {
    public static void main(String[] args) {
        int i = 1, j = 5;

        if (i > j) { //false, so it jumps to sout "3" right away
            if (i <= j) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }

        System.out.println("3"); //output
    }
}