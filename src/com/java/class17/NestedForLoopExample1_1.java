package com.java.class17;
//==========
//Hello
//Hello
//Hello
//==========
//Hello
//Hello
//Hello
//==========
//Hello
//Hello
//Hello
public class NestedForLoopExample1_1 {
    public static void main(String[] args) {


        for (int i = 1; i <= 3; i++) {
            System.out.println("==========");
            for (int j = 1; j <= 3; j++) {

                ////        For i = 3 times and j = 3 times 3*3 = 9 Output 9
                ////        It will check condition i=1 once and jump to j,
                ////        j will be exicute 3 times and then jump out of j loop to i again.
                ////        Then it will start again with the number i = 2 and so on...
                //// So for each i we will have 3 j  be printed

                System.out.println("Hello"); //output 9
            }
        }
    }
}
