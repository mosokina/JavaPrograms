package com.java.class03;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        System.out.println(10 % 3); // Answer - 1
        System.out.println(15 % 4); // Answer - 3

        System.out.println(15 % 2); // Answer - 1
        System.out.println(20 % 2); // Answer - 0
        System.out.println(13 % 2); // Answer - 1
        System.out.println(26 % 2); // Answer - 0

        System.out.println(7 % 10); // Answer - 7 if first nbr is >, answer is first nbr

        // Get last digit from the number
        System.out.println(15 % 10); // Answer - 5
        System.out.println(67 % 10); // Answer - 7
        System.out.println(133 % 10); // Answer - 3 last nbr from 133 is reminder
        System.out.println(265 % 10); // Answer - 5 last nbr from 265 is reminder

        // Remove last digit from the number
        System.out.println(15 / 10); // Answer - 1
        System.out.println(67 / 10); // Answer - 6
        System.out.println(133 / 10); // Answer - 13
        System.out.println(265 / 10); // Answer - 26 first 2 nbr is answer
        System.out.println(2655 / 10); // Answer - 265 first 2 nbr is answer
    }
}
