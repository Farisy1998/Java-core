
public class ArrayDemo {

	public static void main(String[] args) {
		// Types of declarations for array in java
		int[] arr1 = {10, 20, 30, 40, 50};
		
		int arr2[] = {10, 20, 30, 40, 50};
		
		int arr3[] = new int[3];
		arr3[0] = 10;
		arr3[1] = 20;
		arr3[2] = 30;
		
		System.out.println("Array elements are:");
		for(int item : arr3){ // foreach loop (java 1.5 feature)
			System.out.println(item);
		}
	}

}
