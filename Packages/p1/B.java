package p1;

import p1.p3.D;

public class B {

	public static void main(String[] args) {
		A.method1();

		A obj = new A();
		obj.method2();

		// Classes from sub packages can only used by importing it.
		D dObj = new D();
		dObj.method1();
	}

}
