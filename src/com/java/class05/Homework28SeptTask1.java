package com.java.class05;

public class Homework28SeptTask1 {

    public static void main(String[] args) {

        String str1 = "Hello", str2 = "Java";
        int i = 10, j = 20;

        System.out.println(i+j);// statement 1 Answer 30
        System.out.println("i+j");// statement 2 Answer i+j
        System.out.println(str1+i); // statement 3 Answer Hello10
        System.out.println(str1+i+j); // statement 4 Answer Hello1020
        System.out.println(i+j+str1); // statement 5 Answer 30Hello
        System.out.println(str1+i*j); // statement 6 Answer Hello200
        //System.out.println(str1+i-j); // statement 7 Answer Error, could NOT have -j with str
        System.out.println(str1+i+j+str2); // statement 8 Answer Hello1020Java
    }
}
