package main.java.org.example.patterns_exercise.factory.ex_1;

public class TransportCompany {
    public static void main(String[] args) {
        TransportFactory factory = createTransportByType("ship");
        Transport transport = factory.createTransport();

        transport.deliver();
    }

    static TransportFactory createTransportByType(String type) {
        if (type.equalsIgnoreCase("Truck")) {
            return new TruckFactory();
        } else if (type.equalsIgnoreCase("AirPlane")) {
            return new AirplaneFactory();
        } else if (type.equalsIgnoreCase("ShiP")) {
            return new ShipFactory();
        } else {
            throw new RuntimeException(type + " is unknown type");
        }
    }
}
