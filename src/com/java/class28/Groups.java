package com.java.class28;

public class Groups { //parent class

    private String name;
    private char sex;//instance variables
    private double age; //instance variables
    public Groups(String name, char sex, double age) {
        //constructor of class Groups

        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    //1st-------------------------------------------------------
    public String getName() { //getter
        return name;
    }

    public void setName() { //setter
        this.name = name;
    }

    //2nd-------------------------------------------------------
    public String gender (char sex) { //method
    if (sex == 'm') {
        return "He ";
    }else{
        return "She ";
    }
    }
    //3rd -------------------------------------------------------
    public double getAge() { //getter
        return age;
    }
    public void setAge(double  age) { //setter
        this.age = age;
    }

    }

