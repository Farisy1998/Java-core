package Generics.boundedUnknownGenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Pussy"));
        cats.add(new Cat("Kitty"));

        printList(cats);
    }

    public static void printList(List<? extends Animal> animals) {
        System.out.print("[");
        for (Animal animal : animals)
            System.out.print(animal.name + " ");
        System.out.println("]");
    }
}
