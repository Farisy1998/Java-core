package Generics.boundedGenerics;

public class Main {
    public static void main(String[] args) {
        GenericClass<Cat> cat = new GenericClass<>(new Cat("Pussy"));
        cat.printAnimal();
    }
}
