package arraysUtil;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        Integer[] numbers = { 10, 8, 6, 5, 1, 3 };

        System.out.print("Before sorting: [");
        for (int number : numbers)
            System.out.print(number + " ");

        System.out.println("]");

        Arrays.sort(numbers);

        System.out.print("After sorting: [");
        for (int number : numbers)
            System.out.print(number + " ");

        System.out.println("]");

        // convert array to list
        List<Integer> list = Arrays.asList(numbers);

        // changes made in the list will also reflects in the existing array
        list.set(0, 5);

        System.out.print("Array: [");
        for (Integer number : numbers)
            System.out.print(number + " ");
        System.out.println("]");

        System.out.println("List: " + list);
    }
}
