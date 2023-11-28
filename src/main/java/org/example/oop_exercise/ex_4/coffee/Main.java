package org.example.oop_exercise.ex_4.coffee;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine(6, 150, new Sugar());
        machine.makeCoffee();
        CoffeeMachine machine1 = new CoffeeMachine(5, 100, new Milk());
        machine1.makeCoffee();
        CoffeeMachine machine2 = new CoffeeMachine(5, 100, new Cinnamon());
        machine2.makeCoffee();
    }
}
