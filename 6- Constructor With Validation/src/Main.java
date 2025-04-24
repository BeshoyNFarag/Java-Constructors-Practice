/*
6. Constructor with Validation
Write a Java program to create a class called Account with instance variables accountNumber and balance.
Implement a parameterized constructor that initializes these variables with validation:

accountNumber should be non-null and non-empty.
balance should be non-negative.
Print an error message if the validation fails.
*/


public class Main {
    public static void main(String[] args) {
        Account acc = new Account("DE483427934", 23123.23);
        Account acc1 = new Account(" ", 0);


    }
}