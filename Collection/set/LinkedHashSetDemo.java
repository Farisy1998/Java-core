package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // LinkedHashSet store the elements in inserting order
        Set<Integer> set = new LinkedHashSet<>();
        
        set.add(10);
        set.add(5);
        set.add(8);
        set.add(6);

        System.out.println(set);
    }
}
