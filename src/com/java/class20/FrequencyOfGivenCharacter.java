package com.java.class20;

public class FrequencyOfGivenCharacter {
    // Write a program to find frequency of given character
    // the String
    // String - Hello, How are you?
    // Character - e
    // Output - 2

        public static void main(String[] args) {
            String str = "Hello, How are you Tetiana?";
            char target = 'e';
            int count = 0;

            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)==target){
                    count++;
                }
                System.out.println(str.charAt(i)); //print all chars
            }

            System.out.println(count);//how many e letters- our target
        }
}
