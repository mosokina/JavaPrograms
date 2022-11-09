package com.java.class10;

public class IfElseRevisionExample5 {

    public static void main(String[] args) {
        int i = 10, j = -5, k = 11;

        if (i + 1 <= k && j <= 11) { //11<=11 TRUE && -5<=11 TRUE - move on
            k = i + j; // k = 5

            if (i <= k || k + 10 > k + 12) { //10<=5 FALSE || 15>17 FALSE - move on
                System.out.println("1"); //no
            } else {
                System.out.println("2"); //our 1st output "2"
            }
            // keep checking all conditions under big IF
            if (k >= j || k >= (i + j)) { // 5>=-5 TRUE || 5 >=5 TRUE - we found or TRUE
                System.out.println("3"); //we found our 2nd output "3"
            } else {
                System.out.println("4"); //no, because we found or true
            }

        } else {
            System.out.println("5"); //no - big IF is TRUE
        }

        System.out.println("we will coffee for sure"); //3rd output - because it is by itsef
    }
}

