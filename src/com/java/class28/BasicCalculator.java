package com.java.class28;

class BasicCalculator {
//has 2 methods
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    public void sub (int a, int b){
        System.out.println(a-b);
    }
}
class AdvanceCalculator extends BasicCalculator{
    //child class has all 4 methods

    public void mul(int a, int b){
        System.out.println(a*b);
    }

    public void div (int a, int b){
        System.out.println(a / b);
    }
}