package com.java.class06;

public class TypeCastingExample {

        public static void main(String []args){
            double a=10, b=20;
            int result = (int) (a / b); //need to be changed since we can NOT feet larger space (double) in smaller (int)
            System.out.println(result); //Answer 0
        }

}
