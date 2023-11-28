package org.example.oop_exercise.ex_4.coffee;

public class Sugar implements Topping {
    String topping = "sugar";

    @Override
    public String add() {
        return topping;
    }

}
