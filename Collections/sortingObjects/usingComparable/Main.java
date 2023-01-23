package sortingObjects.usingComparable;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student> tree = new TreeSet<>();

        tree.add(new Student(103, "John"));
        tree.add(new Student(105, "Arjun"));
        tree.add(new Student(102, "Arun"));
        tree.add(new Student(101, "Archana"));
        tree.add(new Student(104, "Aparna"));

        for(Student stud: tree)
            System.out.println(stud.name);
    }
}
