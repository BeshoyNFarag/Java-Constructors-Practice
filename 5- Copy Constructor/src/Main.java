/*
5. Write a Java program to create a class called Rectangle with instance variables length and width.
Implement a parameterized constructor and a copy constructor that initializes a new object using the
values of an existing object. Print the values of the variables.
*/

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(2.1f,3.4f);
        Rectangle rec2 = new Rectangle(rec1);
        rec1.getLength();
        rec1.getWidth();
        System.out.println();
        rec2.getLength();
        rec2.getWidth();

    }
}