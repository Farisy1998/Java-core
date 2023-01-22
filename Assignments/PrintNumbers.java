import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int i = 1;
		System.out.println("Using for loop");
		for (i = 1; i <= num; i++) {
			if (num > 100)
				break;
			else if (i % 10 == 0)
				continue;
			else
				System.out.print(i + "\t");
		}

		i = 1;
		System.out.println("\nUsing while loop");

		while (i <= num) {
			if (num > 100)
				break;
			else if (i % 10 != 0)
				System.out.print(i + "\t");
			i++;
		}

		i = 1;
		System.out.println("\nUsing do while loop");
		do {
			if (num > 100)
				break;
			else if (i % 10 != 0)
				System.out.print(i + "\t");
			i++;
		} while (i <= num);
	}

}
