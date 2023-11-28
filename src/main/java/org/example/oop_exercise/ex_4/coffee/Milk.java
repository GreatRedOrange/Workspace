package org.example.oop_exercise.ex_4.coffee;

public class Milk implements Topping {
    String topping = "milk";

    @Override
    public String add() {
        return topping;
    }
}
