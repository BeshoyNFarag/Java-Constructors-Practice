/*
4. Chaining Constructors
Write a Java program to create a class called Student with instance variables studentId, studentName,
and grade. Implement a default constructor and a parameterized constructor that takes all three instance
variables. Use constructor chaining to initialize the variables. Print the values of the variables.
*/


public class Student {

    private int studentID;
    private String studentName;
    private float grade;


    public Student(){
        this(0, " ", 0.0f);


    }

    public Student(int studentID, String studentName, float grade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;
        System.out.println(studentID + " " + studentName + " " + grade );
    }
}
