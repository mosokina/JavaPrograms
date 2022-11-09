package com.java.class18;

public class HW3_Pattern2 {
    public static void main(String[] args) {
        //123456789
        // 1234567
        //  12345
        //   123
        //    1

        for (int i = 5; i >=1; i--){
            for (int sp = 0; sp <= 5-i; sp++) {
                System.out.print(" ");
            }
             for (int j =1; j <=i*2 -1;j++){
                 System.out.print(j);
             }

            System.out.println();
        }
    }
}
