/*
Parameterized Constructor:
Write a Java program to create a class called Dog with instance variables name and color.
Implement a parameterized constructor that takes name and color as parameters and initializes
the instance variables. Print the values of the variables.
*/


public class Dog {

    private String color;
    private String name;

    public Dog (String name, String color){
        this.name = name;
        this.color = color;

        System.out.println(name + " " + color);
    }
}
