package com.java.class22;

public class SumPositiveAndNegative {
    public static void main(String[] args) {

        int data[] = {-12, 34, -45, 54, -23, 56, 78, -2, 21};
        int neg = 0;
        int pos = 0;
        for (int i = 0; i< data.length; i ++){
            if (data[i] < 0) {
                neg = neg+ data[i];
            } else {
                pos = pos + data[i];

            }
        }
        System.out.println("Positive sum: " +pos);
        System.out.println("Negative sum: " +neg);
    }
}
