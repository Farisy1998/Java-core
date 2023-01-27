package Generics;

public class Main {
    public static void main(String[] args) {
        // Generics won't work with primitive types, only with reference types
        Printer<Integer> intPrinter = new Printer<>(200);
        intPrinter.print();

        Printer<String> stringPrinter = new Printer<String>("Hello");
        stringPrinter.print();
    }
}
