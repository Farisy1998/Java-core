

// Implicit type casting is performed automatically when we assign a lower range data type to a higher range
// data type.


public class ImplicitCasting {

	public static void main(String[] args) {
		byte b = 100;
		int i = b;
		System.out.println(i);
		
		long l = i;
		char ch = 'a';
		int x = ch;
		System.out.println(x);	// The ASCII value of the small letter 'x' is printed.
	}

}
