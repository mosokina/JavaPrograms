package com.java.class17;
//123
//123
//123
//123
//123
public class NestedForLoopExample2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // will have 5 rows
            for (int j = 1; j <= 3; j++) {
                System.out.print(j); // will be print value of j 3 times :
                //value j = 1, j = 2, j = 3 on the same line, because PRINT
            }
            System.out.println();// enter and jump to main loop
        }

    }
}
