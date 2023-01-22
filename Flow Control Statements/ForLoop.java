
public class ForLoop {

	public static void main(String[] args) {
		int i = 1;
		for (; i <= 20;) {
			if (i == 10)
				break;	// The break statement will let exit the loop or a block
			System.out.print(i + "\t");
			i++;
		}
	}

}
