package com.java.class17;

import java.util.Scanner;
//    A
//   AA
//  AAA
// AAAA
//AAAAA
public class NestedForLoopExample7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter the number: ");
        int num = sc.nextInt(); //numbers of rows

        for (int i = 1; i <= num; i++) { // main loop , if rows = 5

            for (int s = 1; s <= num - i; s++) { //1st inner loop s = 5-1 = 4
                System.out.print(" "); //will execute 4 spaces
            }

            for (int j = 1; j <= i; j++) { //2nd inner loop j<=1
                System.out.print("A"); // on the sae line with s will print 1 A
            }

            System.out.println(); // spaces will be less, with each row more letters A
        }

    }
}

