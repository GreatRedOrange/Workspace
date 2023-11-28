package org.example.oop_exercise.ex_4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob", "Dylan", new NormalStudentBehaviour());
        Student crazyStudent = new Student("Bob", "Dylan", new CrazyStudentBehaviour());
        student.getBehaviour().read();
        crazyStudent.getBehaviour().read();
        student.getBehaviour().write();
        crazyStudent.getBehaviour().write();

    }
}
