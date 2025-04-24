/*
5. Write a Java program to create a class called Rectangle with instance variables length and width.
Implement a parameterized constructor and a copy constructor that initializes a new object using the
values of an existing object. Print the values of the variables.
*/



public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle (Rectangle rectangle){
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    public void getLength(){
        System.out.println(length);
    }
    public void getWidth(){
        System.out.println(width);
    }
}
