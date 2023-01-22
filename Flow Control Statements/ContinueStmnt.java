
public class ContinueStmnt {

	public static void main(String[] args) {
		int i = 0;

		// Printing odd numbers
		for (; i <= 10; i++) {
			if (i % 2 == 0) {
				continue; // The continue statement will let skip the current iteration
						  // of the for loop and go to next iteration.
			}
			System.out.println(i);
		}
	}

}
