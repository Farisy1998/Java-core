
public class SumOfElements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int item : arr)
			sum += item;

		System.out.println(sum);
	}

}
