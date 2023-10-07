package com.java.class27;

class Demo {
    int balance = 50;

    public void method1() {
        int balance = 40;
        System.out.println(balance);

    }
}

public class TypesOfVariablesExample1{
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.balance); //50 line 4
        d.method1(); //40 print new in balance in method
        d.method1(); // 40 int in method
        System.out.println(d.balance); //50 back to line 4
    }
}
//Output
//50
//40
//40
//50