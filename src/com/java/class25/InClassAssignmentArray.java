package com.java.class25;
//// Write a program to find  length of each word from the String
//// Output
//// Today - 5
//// is - 2
//// Monday, - 7
//// it - 2
//// started - 7
//// well - 4
public class InClassAssignmentArray {
    public static void main(String[] args) {
        String str = "Today is Monday, it started well";

        String words [] = str.split(" ");
        //saving in array each word - {Today,is,Monday,, etc)

        for (String word : words){ //word - each word from string
            System.out.println(word + " = " + word.length());

            }
        }
    }