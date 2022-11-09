package com.java.class17;
//    A
//   AA
//  AAA
// AAAA
//AAAAA
public class NestedForLoopExample7_1 {
      public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { //i<=num if from user

            for (int s =1; s<= 5-i; s++){ // s<= mun-i
                        //we got 5 because   with 1 A we need 4 spase
                                            //with 2 AA we need 3 spase
                                            //with 3 AAA we need 2 spase
                                             //with 4 AAAA we need 1 spase
                                            //with 5 AAAAA we need 0 spase
                System.out.print(" ");
            }

            for (int j = 1; j <=i; j++) {

                System.out.print("A");
            }
            System.out.println();
        }
    }
}


