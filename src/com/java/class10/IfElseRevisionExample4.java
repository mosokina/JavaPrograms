package com.java.class10;

public class IfElseRevisionExample4 {

    public static void main(String[] args) {
        int i = 10, j = -5, k = 11;

        if(i + 1 <= k && j <= 11){ //11<=11 TRUE && -5<=11 TRUE - move on
            k = i + j; // k = 5 it is new now

            if(i <= k){ //10<=5 FALSE - need to check all conditions under big IF
                System.out.println("1"); //no print
            }else if(k >= j || k >= (i+j)){ //5>=-5 TRUE || 5>=5 TRUE
                System.out.println("2"); //output - we found our TRUE
            }else{
                System.out.println("3"); //no because we found our TRUE
            }

        }else{
            System.out.println("4"); //no print, because big If true
        }
    }
}
