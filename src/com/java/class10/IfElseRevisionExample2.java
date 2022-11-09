package com.java.class10;

public class IfElseRevisionExample2 {

    public static void main(String[] args) {
        int i = 10, j = 5;

        if(i > j){ //true
            if(i <= j){ //false
                System.out.println("1");//doesn't print
            }else{
                System.out.println("2"); //because 1st IF is true, we check all condition/ output
            }
        }

        System.out.println("3"); //print it, it is by itself/ output
    }

}
