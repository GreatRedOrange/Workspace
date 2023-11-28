package org.example.oop_exercise.ex_4.coffee;

public class CoffeeMachine {
    private int coffeeGrams;
    private int mlOfWater;
    Topping topping;

    CoffeeMachine(int coffeeGrams, int mlOfWater, Topping topping) {
        this.coffeeGrams = coffeeGrams;
        this.mlOfWater = mlOfWater;
        this.topping = topping;
    }

    void makeCoffee() {
        System.out.println("getting coffee with " + coffeeGrams + " grams " + mlOfWater + " water and " + topping.add());
    }
}
