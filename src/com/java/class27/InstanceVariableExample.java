package com.java.class27;

class Car {
    int numOfCars;

    Car() {
        numOfCars++;
    }
}

public class InstanceVariableExample {
    public static void main(String[] args) {
        Car honda = new Car();
        Car bmw = new Car();
        Car audi = new Car();

        System.out.println(honda.numOfCars);//1
        System.out.println(bmw.numOfCars);//1
        System.out.println(audi.numOfCars);//1
    }
}
//Output
//1
//1
//1