
public class LabeledBlock {

	public static void main(String[] args) {
		int x = 20;

		// Labeled block
		l1: {
			System.out.println("Block begins");

			if (x == 20)
				break l1;	// Specify the block that you we want to breaks out.
			System.out.println("Block ends");
		}

		System.out.println("Outside the block");
	}

}
