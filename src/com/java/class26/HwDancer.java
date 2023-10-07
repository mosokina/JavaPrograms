package com.java.class26;

public class HwDancer {

    String name;
    String logIn;
    int room;
    int age;
    String style = "Hip-Hop";
    int numberInTeam;

    HwDancer(){
        System.out.println("Welcome to the Dance Show!");
    }

    HwDancer(String nameFromUser, int ageFromUser) {
        name = nameFromUser;
        age = ageFromUser;
        logIn = age + name;
    }

    HwDancer(int numberInTeamFromUser, String nameFromUser) {
        numberInTeam = numberInTeamFromUser;
        name = nameFromUser;
    }
}
