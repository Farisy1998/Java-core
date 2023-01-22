
public class LogicalOperators {

	// The logical operators are only applicable with boolean values. And it also improve
	// the performance of our program by skipping the evaluation of both the operands

	public static void main(String[] args) {
		boolean x = true, y = false;

		if (x || y) {
			System.out.println("Inside the if block");
		}
	}

}
