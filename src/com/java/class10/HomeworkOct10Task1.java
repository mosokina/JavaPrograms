package com.java.class10;

import java.util.Scanner;

public class HomeworkOct10Task1 {
    public static void main(String[] args) {

        //Write a program to get 3 digit number from the user
        // (Valid Numbers - 100 to 999 only) and print reverse of the given number in the output
        //Example
        //Input - 325
        //Output - 523

        Scanner sc = new Scanner(System.in);

        System.out.println("Please print your number: ");
        int nbr = sc.nextInt();

        int digit1, digit2, digit3;

        digit1 = nbr % 10;
        digit2 = nbr % 100/10;
        digit3 = nbr % 1000/100;


        System.out.println(digit1 +""+ digit2 + "" +digit3);



        }
}
