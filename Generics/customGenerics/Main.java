package Generics.customGenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Pussy"));
        cats.add(new Cat("Micy"));

        for(Cat cat: cats)
            System.out.println(cat.name);
    }
}
