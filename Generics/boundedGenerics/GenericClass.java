package Generics.boundedGenerics;

public class GenericClass<T extends Animal /*bounded generics*/> {
    T obj;

    GenericClass(T obj) {
        this.obj = obj;
    }

    public void printAnimal() {
        System.out.println(obj.getClass().getName());
        obj.eat();
    }
}
