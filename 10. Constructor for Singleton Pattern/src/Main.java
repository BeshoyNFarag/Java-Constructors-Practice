/*
Write a Java program to create a class called Singleton that ensures only one instance of the
class can be created. Implement a private constructor and a public static method to get the single
instance of the class. Print a message indicating the creation of the instance.
*/


public class Main {
    public static void main(String[] args) {
        Singleton s1 =  Singleton.getInstance();
        Singleton s2 =  Singleton.getInstance();
        
        System.out.println(s1 == s2);
    }
}