package com.java.class28;

public class Kids extends Groups{
    private String  allergies;
    public Kids(String name, char sex, double age) {
        super(name, sex, age);
    }

    public String  isAllergies() {
        return allergies;
    }

    public void setAllergies(String  allergies) {
        this.allergies = allergies;
    }

    public void anyAllergies(String allergies) {

        if (allergies.equalsIgnoreCase("yes")) {
            System.out.println("Please, contact our office at +9075297252 to provide all allergies for  " +getName());
        } else {
            System.out.println(getName() + " is good to go! Thank you for choosing our Preschool!");
        }
    }
}
