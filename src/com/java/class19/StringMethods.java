package com.java.class19;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        System.out.println("1________________________________________");
        // 1. Change Case Of String
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println("2________________________________________");
        // 2. Equality of String
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false

        System.out.println("3________________________________________");
        // 3. Equals ignoring case
        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        System.out.println("4________________________________________");
        // 4. Contains
        String str4 = "Hello Chirag, Welcome to Ebay";
        System.out.println(str4.contains(str1)); // true
        System.out.println(str4.toLowerCase().contains(str3.toLowerCase())); // true

        System.out.println("5________________________________________");
        // 5. Character at Particular Index
        System.out.println(str4.charAt(15));// e

        System.out.println("6________________________________________");
        // 6. Index of Particular character
        System.out.println(str4.indexOf('c'));// 17

        System.out.println("7________________________________________");
        // 7. Length of the String
        System.out.println(str4.length());//29

        System.out.println("8________________________________________");
        // 8. Check if String is empty
        String str5 = "   ";
        System.out.println(str5.isEmpty()); // false
        System.out.println(str5.isBlank()); // true

        System.out.println("9________________________________________");
        // 9. Trim - trimming spaces before and after String
        String str6 = "             Hello     World     ";
        System.out.println(str6.trim());

        System.out.println("10________________________________________");
        // 10. SubString
        String str7 = "Hello User, Welcome to Ebay";
        System.out.println(str7.substring(0));
        System.out.println(str7.substring(0,6));

        System.out.println("11________________________________________");
        // 11. Format
        String title = "Hello %s, Welcome to %s";
        String user = "Chirag";
        String website = "Amazon";
        System.out.println(String.format(title,user,website));

        System.out.println("12________________________________________");
        // 12. Replace
        String title1 = "Hello ZZZ, Welcome to $$$";
        System.out.println(title1.replace("ZZZ", user));
        System.out.println(title1.replace("$$$", website));
        // replaceAll() - We will learn this one once we cover the regular expression

        System.out.println("13________________________________________");
        // 13. Split
        String title2 = "Hello User , Welcome to Ebay";
        String words[]  =    title2.split(" ");
        System.out.println(words.length);

    }
}
