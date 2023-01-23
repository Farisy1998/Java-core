package sortingObjects.usingComparable;

public class Student implements Comparable<Student> {
    Integer id;
    String name;

    Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student stud) {
        return this.id < stud.id ? -1 : this.id > stud.id ? 1 : 0;
    }
}
