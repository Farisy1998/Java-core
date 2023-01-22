
public class PrimitiveAndObject {
	public static void main(String[] args) {
		int x = 100;	// Primitive type
		System.out.println(x);
		
		Integer y = Integer.valueOf(x);	// Converting primitive type to object type
		System.out.println(y);
		
		int z = y.intValue();	// Converting object type back to primitive type
		System.out.println(z);
	}
}
