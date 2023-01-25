package set;

import java.util.Set;
import java.util.TreeSet;

import comparator.StringLengthComparator;

public class TreeSetStringLength {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new StringLengthComparator());

        set.add("Hello");
        set.add("Hi");
        set.add("How are you");
        set.add("Excelent");

        System.out.println(set);
    }
}
