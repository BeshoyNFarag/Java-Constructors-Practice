/*
Constructor Overloading
Write a Java program to create a class called "Book" with instance variables title, author, and price.
Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
*/

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The richest man in babylon", "George");
        Book book3 = new Book("A Random Walk down wall street", "Anton", 14.3);


    }
}