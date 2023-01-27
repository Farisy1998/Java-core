package p2;

import p1.A;

public class C {

	public static void main(String[] args) {
		A.method1();
		A obj = new A();
		obj.method2();
		
		System.out.println("");
		// If two packages have the same class. Then we have to follow the fully qualified
		// name along with package name.
		A.method1();
		A obj2 = new A();
		obj2.method2();

	}

}
