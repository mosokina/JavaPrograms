package com.java.class15;

public class HWAdditionAndSubstactions1to10 {
    //3. Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10

    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                result = result - i;
            } else {
                result = result + i;
            }
        }
        System.out.println(result);
    }
}


