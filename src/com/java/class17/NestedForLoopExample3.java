package com.java.class17;
//111
//222
//333
//444
//555
public class NestedForLoopExample3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { //5 rows
            for (int j = 1; j <= 3; j++) { //inner loop
                System.out.print(i); // will print value of i = 1, 3 times
            }
            System.out.println();// enter and jump to i = 2
        }

    }
}
