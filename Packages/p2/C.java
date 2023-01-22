package p2;

public class C {

	public static void main(String[] args) {
		A.method1();
		A obj = new A();
		obj.method2();
		
		System.out.println("");
		// If two packages have the same class. Then we have to follow the fully qualified
		// name along with package name.
		p1.A.method1();
		p1.A obj2 = new p1.A();
		obj2.method2();

	}

}
