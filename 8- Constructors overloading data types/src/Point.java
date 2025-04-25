/*
Write a Java program to create a class called Point with instance variables x and y.
Implement overloaded constructors:

One constructor takes int parameters.
Another constructor takes double parameters.
Print the values of the variables for each constructor.
*/

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println(x + " " + y);
    }

    public Point(int x , int y){
        this.x = x;
        this.y = y;
        System.out.println(x + " " + y);
    }


}
