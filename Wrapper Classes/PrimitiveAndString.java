
public class PrimitiveAndString {

	public static void main(String[] args) {
		byte x = 100;
		
		String str = Byte.toString(x);	// Converting primitive type to string type
		System.out.println(str);
		
		byte y = Byte.parseByte(str);	// Converting string type back to primitive type
		System.out.println(y);
	}

}
