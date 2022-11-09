package com.java.class06;

public class TypeCastingExample3 {

    public static void main(String []args){
        double d = 2.5;
        int a = 10;
        short s = 20;
        byte b = 100;

        int num = (int)d;  // Answer 2
        double d1 = num; // 2.0
        double d2 = a;// 10.0
        b = (byte)s;//20

        System.out.println(num);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(b);

    }


}
