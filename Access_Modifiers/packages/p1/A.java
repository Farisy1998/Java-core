package packages.p1;

public class A {

	private int a = 30;	// Only accessible with in the class it self it was declared.
	int b = 40;	// Accessible with in the package.
	protected int c = 50;	// Accessible with in the package and classes that extends this class.
	public int d = 60;	// Access any where from the class, package or out side the package.

	public static void main(String[] args) {
		A obj = new A();	// The class members are not static. So we want to create the object
							// of the class A to access them.
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}
