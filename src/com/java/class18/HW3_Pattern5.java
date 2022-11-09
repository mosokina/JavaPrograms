package com.java.class18;
//     0
//    111
//   00000
//  1111111
// 000000000
//  1111111
//   00000
//    111
//     0
public class HW3_Pattern5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int sp = 5; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (i % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >=1; i--){
            for (int sp = 0; sp <= 5 - i; sp++) {
                System.out.print(" ");
            }
            for (int j =1; j <=i*2 -1;j++) {
                if (i % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
    }
}
}


