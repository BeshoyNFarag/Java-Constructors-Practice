/*
4. Chaining Constructors
Write a Java program to create a class called Student with instance variables studentId, studentName,
and grade. Implement a default constructor and a parameterized constructor that takes all three instance
variables. Use constructor chaining to initialize the variables. Print the values of the variables.
*/

public class Main {
    public static void main(String[] args) {
        Student student = new Student(73432,"Paul", 3.5f);
        Student student2 = new Student();


    }
}