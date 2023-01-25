package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet store the elements in a random order
        Set<Integer> set = new HashSet<>();

        // Set  doesn't allows dulpicate values
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println(set);
    }
}
