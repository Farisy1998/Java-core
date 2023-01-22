
public class ArrayReverse {

	static char[] reverse(char[] array) {
		int i = array.length - 1;
		int j = 0;
		char[] newArray = new char[array.length];

		while (i >= 0) {
			newArray[j] = array[i];
			j++;
			i--;
		}

		return newArray;
	}

	public static void main(String[] args) {
		char[] charArray = { 'a', 'b', 'c', 'k' };

		System.out.print("Original array: ");
		for (char ch : charArray)
			System.out.print(ch + " ");

		char[] newCharArray = ArrayReverse.reverse(charArray);
		System.out.println();

		System.out.print("Reversed array: ");
		for (char ch : newCharArray)
			System.out.print(ch + " ");
	}

}
