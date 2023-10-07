package com.java.class36;

class Human{
    String name;

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}

class Animal{
    String type;

    public void eat(){
        System.out.println("Animal type "+ type + " is eating");
    }

    public void sleep(){
        System.out.println("Animal type "+ type + " is sleeping");
    }
}

class Mammal extends Animal{
    //we need both properties in Mammal
    //but we can't extend from both classes
    //class Mammal extends Animal, Humans { - NO
}

public class InterfaceProblem {

}
