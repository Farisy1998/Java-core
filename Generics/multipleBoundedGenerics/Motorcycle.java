package Generics.multipleBoundedGenerics;

public class Motorcycle extends Vehicle implements VehicleInterface {
    String name;

    public Motorcycle(String name) {
        this.name = name;
    }

    @Override
    public void pullStop() {
        System.out.println("Stopped");
    }

    @Override
    public void pushStart() {
        System.out.println("Started");
    }
    
}
