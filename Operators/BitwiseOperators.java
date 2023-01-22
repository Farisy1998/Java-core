
public class BitwiseOperators {
	
	//  The bitwise operators are applicable with both boolean and integral values

	public static void main(String[] args) {
		System.out.println(true & false);	// true, if both of the operands are true
		System.out.println(true | false);	// true, if any of the operand is true
		System.out.println(true ^ false);	// true, if the operands are different

		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		
		// ~ - Bitwise unary compliment. It can only be applied to integer values
		System.out.println(~4);
		
		// ! - Boolean compliment. It can be only applied to boolean values
		System.out.println(!true);
	}

}
