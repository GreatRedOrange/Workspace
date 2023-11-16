package main.java.org.example.patterns_exercise.factory.ex_1;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by Truck");
    }
}
