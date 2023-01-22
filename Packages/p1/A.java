package p1;

public class A {

	public static void method1() {
		
		// If we are using any class from different package with out using a import 
		// statement. Then that class or package is belongs to the java.lang package.
		// The java.lang package is implicitly imported to a class by the JVM when the
		// class is created.
		
		System.out.println("Inside method1 of class A in package p1");
	}

	public void method2() {
		System.out.println("Inside method2 of class A in package p1");
	}

}
