package com.java.class17;

import java.util.Scanner;
//A
//AA
//AAA
//AAAA
//AAA
//AA
//A

public class NestedForLoopExample6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the number of rows: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num / 2 + 1; i++) { //1st half num/2+1
            for (int j = 1; j <= i; j++) {// we need 1 letter in the beginning
                System.out.print("A");
            }
            System.out.println();
        }

        for (int i = 1; i <= num / 2; i++) {//2nd half
            for (int j = 1; j <= num / 2 + 1 - i; j++) { //6/2+1 -1 = 3 letters
                System.out.print("A");
            }
            System.out.println();
        }

    }
}

