package arraysUtil;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = { 10, 8, 6, 5, 1, 3 };

        System.out.print("Before sorting: [");
        for (int number : numbers)
            System.out.print(number + " ");

        System.out.println("]");

        Arrays.sort(numbers);

        System.out.print("After sorting: [");
        for (int number : numbers)
            System.out.print(number + " ");

        System.out.println("]");
    }
}
