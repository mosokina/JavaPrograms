package com.java.class43;

import java.util.*;

//2. In the below example, we are storing the list of marks from each student into the HashMap.
// Implement the blank method to return student name who got the TOTAL highest marks
public class HW2_GreatestMarkFromStudents {
    public static void main(String[] args) {
        Map<String, List<Integer>> studentMarks = new HashMap<>();

        List<Integer> marksOfAli = new ArrayList<>(Arrays.asList(94, 51, 34, 60, 23));
        List<Integer> marksOfChirag = new ArrayList<>(Arrays.asList(34, 45, 34, 43, 89));
        List<Integer> marksOfMaria = new ArrayList<>(Arrays.asList(93, 56, 24, 85, 23));
        List<Integer> marksOfAlina = new ArrayList<>(Arrays.asList(100, 65, 23, 62, 77));
        List<Integer> marksOfCharlie = new ArrayList<>(Arrays.asList(22, 50, 87, 60, 90));

        studentMarks.put("Ali", marksOfAli);
        studentMarks.put("Chirag", marksOfChirag);
        studentMarks.put("Maria", marksOfMaria);
        studentMarks.put("Alina", marksOfAlina);
        studentMarks.put("Charlie", marksOfCharlie);

        System.out.println(getStudentNameHavingGreatestTotal(studentMarks));
    }

    // Implement below method to find total greatest mark
    public static String getStudentNameHavingGreatestTotal(Map<String, List<Integer>> studentMarks) {
        String studentName = null;
        int maxMarks =0; //variable to store a value of the highest mark
        for (Map.Entry<String,List<Integer>> pair : studentMarks.entrySet()){ //parsing through the given Map
        int sumOfMarks = 0; //to store sum of marks
            List<Integer> list = pair.getValue(); //storing current list of marks in new ArrayList
            for(int mark : list){ //counting sum of marks and storing it in sumOfMarks
                sumOfMarks = sumOfMarks+mark;
            }
        if (sumOfMarks>maxMarks){ // compare if sum of marks for current map is greater than max sum of marks
            maxMarks= sumOfMarks; //updating max sum of marks and if it's true
            studentName = pair.getKey(); //assigning a current key to student
        }
        }
        return studentName;
    }
}
