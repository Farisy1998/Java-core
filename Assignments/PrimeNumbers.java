import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {
		boolean primeFlag = true;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();

		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0) {
				primeFlag = false;
				break;
			}
		}
		if (primeFlag && num != 1)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}

}
