package com.java.class17;
//AAAAA
//AAAA
//AAA
//AA
//A
public class NestedForLoopExample5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // 5 rows

            for (int j = 1; j <= 6 - i; j++) { // j <= 6 - 1 = 5
                System.out.print("A"); // 5 letters A in 1st row, then 4, 3, 2,1
            }

            System.out.println(); // enter to next value of i
        }
    }
}
//        My way:
//        for (int i = 1; i <= 5; i++) {
//
//            for (int j = 5; j >= i; j--) { //depends on value of i
//                System.out.print("A");
//            }
//            System.out.println();
//        }
