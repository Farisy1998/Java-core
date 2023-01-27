package packages.p2;

import packages.p1.A;

public class C extends A {

	public static void main(String[] args) {
		A aObj = new A();
		System.out.println(aObj.d);
		
		C cObj = new C();
		System.out.println(cObj.c);	// In-order to access the member c we must create the object of
									// class C
	}

}
