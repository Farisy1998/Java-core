package Generics.genericFields;

public class GenericClass<T, V /* , ... */> {
    T obj1;
    V obj2;

    GenericClass(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
}
