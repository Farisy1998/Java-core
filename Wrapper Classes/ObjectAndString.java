
public class ObjectAndString {

	public static void main(String[] args) {
		long x = 1000;
		
		Long l = Long.valueOf(x);
		System.out.println(l);
		
		String str = l.toString();	// Converting object type to String
		System.out.println(str);
		
		Long z = Long.valueOf(str);	// COverting String type back to object type
		System.out.println(z);
	}

}
