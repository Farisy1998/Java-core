
public class AllInOne {

	public static void main(String[] args) {
		int x = 100;
		
		String str = Integer.toString(x);	// Primitive type to string
		
		Integer i = new Integer(str);	// String to wrapper
		
		String s = i.toString();	// Wrapper to string
		
		int y = Integer.parseInt(s);	// String to primitive
	}

}
