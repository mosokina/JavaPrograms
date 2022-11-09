package com.java.class17;

import java.util.Scanner;
//         A
//        AAA
//       AAAAA
//      AAAAAAA
//     AAAAAAAAA
//    AAAAAAAAAAA
//   AAAAAAAAAAAAA
//  AAAAAAAAAAAAAAA
// AAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAA
public class NestedForLoopExample8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //10 rows MAIN loop

            for (int s = 1; s <= 10 - i; s++) { //1st inner loop with spaces
                System.out.print(" "); // s = 10-1 = 9 spaces in 1st row
            }

            for (int j = 1; j <= i * 2 - 1; j++) { // 2nd inner loop
                System.out.print("A"); //1*2 -1 = 1 letter A in the 1st row
            }

            System.out.println(); //with each row less spaces and more A
        }
    }
}

//