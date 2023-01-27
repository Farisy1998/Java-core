package Generics.unknownGenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        printList(numbers);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Pussy"));
        cats.add(new Cat("Miecy"));
        cats.add(new Cat("Kitty"));
        printList(cats);
    }

    public static void printList(List<?> list) {
        System.out.println("List: " + list);
    }
}
