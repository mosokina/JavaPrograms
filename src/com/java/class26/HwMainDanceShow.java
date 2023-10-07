package com.java.class26;

public class HwMainDanceShow {
    public static void main(String[] args) {

        HwDancer welcome = new HwDancer();

        HwDancer dancer = new HwDancer("Maria", 8);
        System.out.println("Your login is: " + dancer.logIn);


        HwDancer roomForPractice = new HwDancer(5, "JoJoTeam");
        System.out.println(roomForPractice.name+ ", your room for practice is " + roomForPractice.numberInTeam);


    }
}
