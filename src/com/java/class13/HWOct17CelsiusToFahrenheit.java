package com.java.class13;

import java.util.Scanner;

public class HWOct17CelsiusToFahrenheit {
    public static void main(String[] args) {
        //1. Write a program to take a temperature from the user in celsius
        // and convert it into Fahrenheit  using the method
        //Input
        //Enter Temperature in celsius = 96.11
        //
        //Output
        //Temperature in Fahrenheit = 205

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter temperature in Celsius: ");

        double tempC = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit is: " +celToFah(tempC));

    }

    static double celToFah (double tempF){
        double result =  (tempF * 9/5) + 32;
        return result;
    }

}
