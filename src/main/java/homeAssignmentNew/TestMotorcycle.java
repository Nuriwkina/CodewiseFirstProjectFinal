package homeAssignmentNew;

public class TestMotorcycle {
    public static void main(String[] args) {

        Motorcycle mt = new Motorcycle("motorcycle", "BMW",2023);
        mt.startEngine();

        System.out.println(" Motorcycle is running? " + mt.isRunning);
        mt.stopEngine();
        System.out.println(" Motorcycle is stopped? " + mt.isRunning);

    }
}
