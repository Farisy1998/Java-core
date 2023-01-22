
public class ArrayReplacement {

	public static void main(String[] args) {
		int[] arr = {3, 5, 5, 3, 5, 7};
		int i = 1;
		
		// Check if there is element 3 exist before the element 5. If, then replace 5 -> 0
		while(i<=arr.length-1){
			if(arr[i-1] == 3 && arr[i] == 5)
				arr[i] = 0;
			
			i++;
		}
		
		for(int item : arr)
			System.out.print(item+" ");
	}

}
