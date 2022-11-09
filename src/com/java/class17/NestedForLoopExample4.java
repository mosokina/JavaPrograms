package com.java.class17;
//A
//AA
//AAA
//AAAA
//AAAAA
public class NestedForLoopExample4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // 5 rows

            for (int j = 1; j <= i; j++) { //depends of value i
                System.out.print("A"); //1st row value i = 1, j <=1, A will be print once
                //2nd row value i = 2, j<=2 TRUE, A will be print twice ...
            }

            System.out.println(); //jump to main loop
        }

    }
}
