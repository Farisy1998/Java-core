package comparator;

import java.util.Comparator;

import sortingObjects.Employee;

public class EmployeeIdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.id < e2.id ? -1 : e1.id > e2.id ? 1 : 0;
    }

}
