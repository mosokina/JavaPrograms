package com.java.class29;

class Vehicle {
    int speed = 50;

    void drift(){
        System.out.println("Drifting Car");
    }
}

// this - it refers to current class object
class Car extends Vehicle {
    int speed = 100;

    void drift() {
        int speed = 200;
        System.out.println(speed); // 200
        System.out.println(this.speed); // 100
        System.out.println(super.speed); // 50
        // drift(); // The process of calling the function itself called Recursion
        super.drift();
    }
}

public class ThisAndSuperExample {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.speed); // 100
        c.drift();
    }
}

//        100 - calling Car line 13
//        200 - local line 17 since it has sout
//        100 - this.speed in constructor line 13
//        50 - super.speed from parent Vehicle line 4
//        Drifting Car - since we called parent line 21 , there is sout