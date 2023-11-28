package org.example.oop_exercise.ex_4;

public class Student {
    private final String firstName;
    private final String secondName;
    private final Behaviour behaviour;


    public Student(String firstName, String secondName, Behaviour behaviour) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.behaviour = behaviour;
    }

    public Behaviour getBehaviour() {
        return behaviour;
    }
}
