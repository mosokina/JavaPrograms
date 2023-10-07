package com.java.class29;

public class MainBag {

    public static void main(String[] args) {

    Bag b = new Bag(); //obj with no arguments
    Bag b1 = new Bag("Glam Bag",13,148);
    Bag b2 = new Bag(5, 1);

    GlamBag gb = new GlamBag(); //obj with no arguments
    GlamBag gb1 = new GlamBag("Glam Bag Plus",28,230,"Free Shipping");
    GlamBag gb2 = new GlamBag(8,3);

        System.out.println("Our first option is \"" + b1.getName() +  "\" with monthly price of $" + b1.getPrice() +" or annual membership for $" + b1.getAnnualPrice());
        System.out.println();
        System.out.println(b1.getName() + " helps you discover your new faves with " +b2.getItem()+ " personalized, deluxe-size beauty samples sent in a cute makeup bag. " +
                "\nYou also get to choose " +b2.getChoose()+" product for your bag each month, making this treat to yourself even more fun.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Our second option is \"" + gb1.getName() +  "\" with monthly price of$" + gb1.getPrice() +" or annual membership for $" + gb1.getAnnualPrice() +
                " and "+ gb1.freeShipping);
        System.out.println();
        System.out.println(gb1.getName() + " delivers you "+gb2.getItem()+" personalized, full-size beauty products  in a themed drawstring bag with a "
                + gb1.freeShipping+". \nThere’s always so much to love because you get to pick "+gb2.getChoose()+" products each month.");
    }
}
