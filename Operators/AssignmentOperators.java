
public class AssignmentOperators {

	public static void main(String[] args) {
		int a = 100;	// Assigning value 100 to the variable a.
		int x, y, z;
		x = y = z = 200; // Assignment chaining

		System.out.println(x + ", " + y + ", " + z);

		int b = 20;
		b += 40; // Compound assignment (b=b+40)
		System.out.println(b);
	}

}
