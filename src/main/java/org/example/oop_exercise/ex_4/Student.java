package org.example.oop_exercise.ex_4;

public class Student {
    private String firstName;
    private String secondName;
    private StudentBehaviour studentBehaviour;


    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.studentBehaviour = new StudentBehaviour();
    }

    public void doWrite() {
        studentBehaviour.write();
    }

    public void doRead() {
        studentBehaviour.read();
    }
}
