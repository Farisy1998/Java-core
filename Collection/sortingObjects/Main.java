package sortingObjects;

import java.util.Set;
import java.util.TreeSet;
import comparator.EmployeeNameComparator;

public class Main {
    public static void main(String[] args) {
        Set<Employee> tree = new TreeSet<>(new EmployeeNameComparator());

        tree.add(new Employee(103, "John"));
        tree.add(new Employee(105, "Arjun"));
        tree.add(new Employee(102, "Arun"));
        tree.add(new Employee(101, "Archana"));
        tree.add(new Employee(104, "Aparna"));

        for (Employee emp : tree)
            System.out.println(emp.id + ": " + emp.name);
    }
}
