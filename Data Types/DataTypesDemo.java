
public class DataTypesDemo {

	public static void main(String[] args) {
		byte a = -50;	// -128 to +127 (1 byte)
		short b = 150;	// -32768 to +32767 (2 bytes)
		int c = 10000;	// -2^31 to +2^31-1 (4 bytes)
		long d = 1000000;	// -2^63 to +2^63-1 (8 bytes)
		char e = 'a';	// 0 to 65535 (2 bytes)
		float f = 1.23F;	// +_3.40282347E+38F (4 bytes)
		double g = 12345.6789;	// +_1.79769313486231570E+308 (8 bytes)
		boolean bool = true;
		
		byte h = 20;
		
		int res = a+h;
	}

}
