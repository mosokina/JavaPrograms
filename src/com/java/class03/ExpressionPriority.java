package com.java.class03;

public class ExpressionPriority {

    public static void main(String[] args) {

        int result = 6 * 8 / 3 + 4 / 2 * 3;

        int result1  = 10 / 5 * 8 / 4 - 20 / 5 / 4 + 1;

        int result2 = 6 + 6 + 2;

        int result3 = 10 * 5 * 10 / 5 / 20 / 5 + 1;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
