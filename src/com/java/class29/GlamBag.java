package com.java.class29;

public class GlamBag extends Bag { //child class

    String freeShipping; //instance variable

    public GlamBag(){} ////no argument constructor

    public GlamBag(String name, int price, int annualPrice, String freeShipping) {
        super (name,price,annualPrice); //calling constructor from parent class Bag
        this.freeShipping = freeShipping;
    }

    public GlamBag(int item, int choose) {
        super(item,choose);
    }
}


