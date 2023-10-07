package com.java.class43;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


//In the below example, we are finding the frequency of each name.
// Now print the name of the person who is having the greatest frequency
public class HW1_FrequencyOfNames {
    public static void main(String[] args) {
        String names = "chirag maria gulnur ali " +
                "maryna max ali maria max " +
                "ali chirag yana maggie ali " +
                "yana maggie ali maryna max";

        String[] arrayOfNames = names.split(" ");
        // Creating HashMap
        // Declaring objects of string and integer type
        Map<String, Integer> frequency = new HashMap<>();

        for (String name : arrayOfNames) {
            if (frequency.containsKey(name)) {
                frequency.put(name, frequency.get(name) + 1);
            } else {
                frequency.put(name, 1);
            }
        }
        System.out.println(frequency);

        // Using Collections.max() method returning max
        // value in HashMap and storing in a integer variable
        int getMaxValue = (Collections.max(frequency.values()));

        // Iterate through HashMap
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == getMaxValue) {

                // Print the key with max value
                System.out.println("Max value is " + entry.getKey() + " = " + getMaxValue);
            }
        }
    }
}
