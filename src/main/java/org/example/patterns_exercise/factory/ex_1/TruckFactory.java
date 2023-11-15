package main.java.org.example.patterns_exercise.factory.ex_1;

public class TruckFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
