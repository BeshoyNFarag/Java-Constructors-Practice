/*
Write a Java program to create a class called Classroom with instance variables className and
students (an array of strings). Implement a parameterized constructor that initializes these variables.
Print the values of the variables.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    private String className;
    ArrayList<String> students = new ArrayList<String>();


    public Classroom(String className, String ... student) {
        this.className = className;
        for (int i = 0; i < student.length; i++) {
            this.students.add(student[i]);
        }
        System.out.println(className);

        System.out.println(students);

    }
}
