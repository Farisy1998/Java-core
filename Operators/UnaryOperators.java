
public class UnaryOperators {

	public static void main(String[] args) {
		int x = 10;
		//int y = ++x;	// Pre-increment
		//int y = x++;	// Post-increment
		//int y = --x;	// Pre-decrement
		int y = x--;	// Post-decrement

		System.out.println("value of x is: " + x);
		System.out.println("Value of y is: " + y);
	}

}
