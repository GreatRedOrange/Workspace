package main.java.org.example.oop_exercise.ex_1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.2);
        Rectangle rectangle = new Rectangle(10, 1.2);
        Triangle triangle = new Triangle(2.3, 4.8);

        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();
    }
}
