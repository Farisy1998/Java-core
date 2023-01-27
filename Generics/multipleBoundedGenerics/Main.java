package Generics.multipleBoundedGenerics;

public class Main {
    public static void main(String[] args) {
        GenericClass<Car> car = new GenericClass<>(new Car("Lamborgini"));
        car.getVehicle();

        GenericClass<Motorcycle> bike = new GenericClass<>(new Motorcycle("Ducati"));
        bike.getVehicle();
    }
}
