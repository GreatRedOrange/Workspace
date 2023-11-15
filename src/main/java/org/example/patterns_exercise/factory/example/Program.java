package main.java.org.example.patterns_exercise.factory.example;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperBySpecialty("Cpp");
        Developer developer = factory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java"))
            return new JavaDeveloperFactory();
        else if (specialty.equalsIgnoreCase("cpp"))
            return new CppDeveloperFactory();
        else
            throw new RuntimeException(specialty + " is unknown specialty");
    }
}
