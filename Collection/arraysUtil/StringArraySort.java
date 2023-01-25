package arraysUtil;

import java.util.Arrays;

public class StringArraySort {
    public static void main(String[] args) {
        String[] str = { "X", "B", "A", "Y", "Z" };

        System.out.print("Before sorting: [");
        for (String s : str)
            System.out.print(s + " ");
        System.out.println("]");

        Arrays.sort(str, new StringComparator());

        System.out.print("After sorting: [");
        for (String s : str)
            System.out.print(s + " ");
        System.out.println("]");

        // Binary search
        int index = Arrays.binarySearch(str, "Z", new StringComparator());

        System.out.println("Element found at index: " + index);
    }
}
