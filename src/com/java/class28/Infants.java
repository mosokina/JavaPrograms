package com.java.class28;

public class Infants extends Groups {

    private String food ;

    public Infants(String name, char sex, double age, String food) { //constructor
        super(name, sex, age);
        this.food = " breast milk or formula. ";
    }

    public void sleepSchedule() { //method
        System.out.println(getName() + " will have a nap twice a day."); //
    }

    public String getFood() {
        if (getAge() < 0.6) {
            return food;
        } else {
            return "first baby food and" + food;
        }
    }

    public void setFood(String food) {
        this.food = food;

    }
}