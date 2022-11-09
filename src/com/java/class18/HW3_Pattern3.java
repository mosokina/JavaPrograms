package com.java.class18;

public class HW3_Pattern3 {
    public static void main(String[] args) {
        //     1
        //    123
        //   12345
        //  1234567
        // 123456789

        for (int i =1; i <=5; i++){
            for(int sp = 5; sp >= i; sp --){
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2 -1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

