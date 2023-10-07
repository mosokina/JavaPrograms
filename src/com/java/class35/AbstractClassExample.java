package com.java.class35;

abstract class Bank { //can't create object of Bank

    int balance; //instance variable

    Bank(){ //constructor will be called whenever we create an object of a child class
        balance = 1000;
    }
    public abstract void displayRateOfInterest(); //class need to be abstract

    public void deposit (int amount){ //instance method
    balance = balance +amount;
    }
}

class ChaseBank extends Bank{ ///exist
    public void displayRateOfInterest() {

        System.out.println("0.01%");
    }
}

class CityBank extends Bank{
    public void displayRateOfInterest() {

        System.out.println("0.06%");
    }
}


    public class AbstractClassExample {

    public static void main(String[] args) {
//Bank b = new Bank(); can't create an object of abstract class Bank
//b.displayRateOfInterest(); if it will be a normal class
    }
}
