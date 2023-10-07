package oopproject;

import java.util.Random;

public abstract class Bank {

    double balance;
    int accountNumber;
    String name;

    Bank(){ //constructor
        accountNumber = new Random().nextInt();
    }

    Bank(String name, int balance){
        accountNumber = new Random().nextInt();
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        //we need to handle situation, when balance is not enough for shopping
        if(amount > balance){
            //we can't do System.out.println("First get rich and then place order!!")
            //output:
            //Exception in thread "main" java.lang.RuntimeException:
            throw new RuntimeException("First get rich and then place order!!");
        }else {
            balance = balance - amount;
        }
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void viewBalance(){
        System.out.println(balance);
    }

    public void transerMoney(Person targetAccountPerson, double amount){
        //target - to which account I want to transfer
        targetAccountPerson.getBankAccount().deposit(amount);
        balance = balance - amount;
    }
}

class Chasebank extends Bank{
    final double RATE_OF_INTEREST = 4.5;
    final int ROUTING_NUMBER  = 32534;

    public void takeLoan(double amount){
        balance = balance + (amount * RATE_OF_INTEREST)/100;
    }
}

class BankOfAmerica extends Bank {

    public void takeInsurance(Person p) { //taking age from the user Person
        if (p.age > 60) {
            balance = balance * 0.9; // give 10%
        } else if (p.age > 50) {
            balance = balance * 0.95;//5%
        } else if (p.age > 40) {
            balance = balance * 0.97;//3%
        } else {
            balance = balance * 0.98;//2%
        }
    }
}