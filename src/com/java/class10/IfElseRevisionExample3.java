package com.java.class10;

public class IfElseRevisionExample3 {

    public static void main(String[] args) {
        int i = 10, j = 5, k = 11;

        if(i + 1 <= k && j <= 11){ //11<=11 TRUE && 5<=11 TRUE - move on

            if(i>k){ //FALSE, but we need to check all condition under big IF
                System.out.println("1"); //no
            }else if(k > j){ //11>5 TRUE
                System.out.println("2");//output, because we found our TRUE "2"
            }else{
                System.out.println("3");//no
            }

        }else{
            System.out.println("4"); //no, because bif If is true
        }
    }
}
