package Generics.multipleBoundedGenerics;

public class GenericClass<T extends Vehicle & VehicleInterface /*multiple bounded generics*/> {
    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public void getVehicle() {
        System.out.println(obj.getClass().getName());
    }
}
