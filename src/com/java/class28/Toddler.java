package com.java.class28;

public class Toddler extends Groups {
    public Toddler(String name, char sex, double age, String isPottyTrained) {
        super(name, sex, age);
    }
    private String isPottyTrained;
    public String getIsPottyTrained() {
        return isPottyTrained;
    }
    public void setIsPottyTrained(String isPottyTrained) {
        this.isPottyTrained = isPottyTrained;
    }

    public void ifPottyTrained(String isPottyTrained) {

        if (isPottyTrained.equalsIgnoreCase("yes")) {
            System.out.println("Good job on potty training.");
        } else {
            System.out.println("We will recommend to start a potty training for " +getName());
        }
    }
}




