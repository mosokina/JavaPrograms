package com.java.class36;


interface Bank{ //it's not a class , it can be public, but we already
    // have ----> public class InterfaceExample

    // All variable in interface by default public, final, static
    //public static final int balance = 1000;

    int ROUTING_NUMBER = 454324; //all capitals - CONSTANT, can't change

    // All methods in interface are by default public and abstract
    void deposit(int amount);

    void withdraw(int amount);
} ///end of interface

interface PSUBank extends Bank{ // or extends Bank, Building
    //interface can extends another interface or MULTIPLE
    void createOffers();

    void additionalSecurity();
}

interface Building{

}

class ChaseBank implements PSUBank, Building{
    //class has implements MULTIPLE interface

    PSUBank b = new ChaseBank();


    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void createOffers() {

    }

    @Override
    public void additionalSecurity() {

    }
}


public class InterfaceExample {


}
