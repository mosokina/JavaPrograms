package com.java.class27;

class BankAcc {
    int balance = 50;

    public void method1() {
        System.out.println(balance);
        int balance = 40;
    }
}


public class TypesOfVariablesExample2 {
    public static void main(String[] args) {
        BankAcc b = new BankAcc();
        System.out.println(b.balance); //50
        b.method1();//50 not changing to 40, since it's different int balance
        b.method1(); //50
        System.out.println(b.balance);//50
    }
}
//Output
//50
//50
//50
//50