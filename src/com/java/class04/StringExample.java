package com.java.class04;

public class StringExample {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Everyone";
        int num1 = 10;
        int num2 = 20;

        // We are learning String Concatenation
        System.out.println(str1 + str2); // Concatenation HelloEveryone
        System.out.println(str1 + num1); // Concatenation  Hello10
        System.out.println(str1 + num1 + num2); // Concatenation Hello1020 IMPORTANT we are writing from LEFT to RIGHT
        System.out.println(num1 + num2 + str1); // Add, Concat 30Hello (left to right)
        System.out.println(str1 + (num1 + num2)); // Hello30 first what is in ()

        System.out.println(str1 + num1 * num2); // Hello200 like in math: first *, then +
        System.out.println(str1 + num1 + num2 + str2); // Hello1020Everyone (left to right)

        //     System.out.println(str1 + num1 - num2); // Error (with String we can use + ONLY)

        System.out.println(num1 + "num2" + str1); //10num2Hello (as it is because in "")
        System.out.println(str1 + (num2 - num1)); //Hello10
    }
}
