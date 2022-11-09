package com.java.class16;

public class HW3FindResultOfDivision {
    // 3.  Java program to find result of 1/2 + 2/3 + 3/4 + 4/5 +......10/11

    public static void main(String[] args) {
        double sum = 0;

          for (int a = 1, b = 2; a <= 10 && b <=11; a++, b++) {
           double eachNum = (double)a/b;
            sum = sum +eachNum;
        }
            System.out.println("The result is:" + sum);
        }
}
