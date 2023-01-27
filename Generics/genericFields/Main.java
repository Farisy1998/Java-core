package Generics.genericFields;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer, String> obj = new GenericClass<>(100, "John");
        System.out.println(obj.obj1.getClass().getName());
        System.out.println(obj.obj2.getClass().getName());

        GenericClass<String, Boolean> another = new GenericClass("Is Approved", true);
        System.out.println(another.obj1.getClass().getName());
        System.out.println(another.obj2.getClass().getName());
    }
}
