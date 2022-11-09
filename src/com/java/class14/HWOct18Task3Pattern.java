package com.java.class14;

public class HWOct18Task3Pattern {

    //3. Write a Java program to Print Pattern 1 10 2 9 3 8 4 7 5 6
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        while (a<b) {
            System.out.println(a);
            System.out.println(b);

            a++;
            b--;
        }
    }
}
//        int j =10;
//        for (int i =1; i <= 5;i++){
//
//            System.out.println(i);
//            System.out.println(j);
//             j--;
//        }
//    }
//}
// for (int i =1, j =10; i <= 5 ;i++,j--) can be all together