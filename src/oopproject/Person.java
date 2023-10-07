package oopproject;

public class Person { //not abstract, need to connected to the Bank
    String name; //object variable
    int age;
    char gender;
    Bank bankAccount; //we don't know wchich bank
    //user defined data type
    Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void setBank(Bank bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Bank getBankAccount() {
        return bankAccount;
    }
    }
