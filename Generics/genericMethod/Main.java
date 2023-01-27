package Generics.genericMethod;

public class Main {
    public static void main(String[] args) {
        genericMethod(23);
        genericMethod("Hello");
        genericMethod(new Object());
        anotherMethod(101, "John");
        System.out.println(returnGeneric("Is Approved", true));
    }

    public static <T> void genericMethod(T obj) { // generic method
        System.out.println(obj.getClass().getName());
    }

    public static <T, V /* , ..... */> void anotherMethod(T obj1, V obj2) { // generic method with multiple generic
                                                                            // parameters
        System.out.println("[" + obj1 + ": " + obj2 + "]");
    }

    public static <T, V> T returnGeneric(T obj1, V obj2){
        System.out.println(obj2);
        return obj1;
    }
}
