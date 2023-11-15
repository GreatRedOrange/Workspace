package main.java.org.example.patterns_exercise.factory.ex_1;

public class AirplaneFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
