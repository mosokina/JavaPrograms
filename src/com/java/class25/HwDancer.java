package com.java.class25;

public class HwDancer {

    String name;
    String numberInShow;
    double totalPoints;
    int age;
    String style;
    int numberInTeam;

    void teamCategory(String name, int numberInTeam) {
        if (numberInTeam == 1) {
            System.out.println(name + " competes in category \"Solo\"");
        }
        if (numberInTeam == 2) {
            System.out.println(name + " compete in category \"Duet\"");
        }
        if (numberInTeam >= 5) {
            System.out.println(name + " compete in category \"Team\"");
        }
    }

    void timeInShow(String numberInShow, int age, String style) {
        if (age >= 5 && age <= 10) {
            if (style.equalsIgnoreCase("Contemporary")) {
                System.out.println("Participant " + numberInShow + " attend at 8:00 am ");
            }
            if (style.equalsIgnoreCase("Hip Hop")) {
                System.out.println("Participant " + numberInShow + " attend at 10:00 pm");
            }

        } else {
            System.out.println("Participant with number " + numberInShow + " attend tomorrow.");
        }
    }

        void totalPoints(double pointsJ1, double pointsJ2, double pointsJ3){


            totalPoints = pointsJ1 + pointsJ2 + pointsJ3;
            System.out.println("Total point are: " + totalPoints);
        }
    }
