package set;

import java.util.Set;
import java.util.TreeSet;

import comparator.StringBufferComparator;

public class TreeSetOfObjects {
    public static void main(String[] args) {
        // TreeSet uses comparator interface to sort the StringBuffer objects
        Set<StringBuffer> set = new TreeSet<>(new StringBufferComparator());

        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("mno"));
        set.add(new StringBuffer("xyz"));
        set.add(new StringBuffer("def"));

        System.out.println(set);
    }
}
