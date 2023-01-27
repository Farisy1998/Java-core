package Generics.multipleBoundedGenerics;

public class Car extends Vehicle implements VehicleInterface {
    String name;

    public Car(String name) {
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
