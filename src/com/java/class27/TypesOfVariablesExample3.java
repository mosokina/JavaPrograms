package com.java.class27;

class Bank {
    int balance = 50;

    public void method1() {
        balance = 40;
        System.out.println(balance);
    }
}


public class TypesOfVariablesExample3 {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.balance); //line 4 - 50
        b.method1(); //calling method -40
        b.method1();//calling method -40
        System.out.println(b.balance);//balance changed to 40 after method
    }
}
//output
//50
//40
//40
//40