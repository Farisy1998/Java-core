package flowControlStatements;

public class ForLoop {

	public static void main(String[] args) {
		for (;;) {
			System.out.println("Hello"); // Infinite loop
			break;
		}
		// System.out.println("Outside the for loop");

		int i = 1;
		for (System.out.println("Initialize"); i <= 5; System.out.println("Increment")) {
			System.out.println(i);
			i++;
		}
	}

}
