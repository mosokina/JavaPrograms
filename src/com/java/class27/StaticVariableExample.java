package com.java.class27;

class Person {
    static int numOfPerson;

    Person() {
        numOfPerson++;
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        Person vlad = new Person();
        Person maria = new Person();
        Person jasur = new Person();

        System.out.println(vlad.numOfPerson); //3 all are calling total number of person which is 3
        System.out.println(maria.numOfPerson);//3
        System.out.println(jasur.numOfPerson);//3
    }
}
//Output
//3
//3
//3