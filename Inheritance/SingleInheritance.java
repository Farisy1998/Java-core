
// The java compiler defaultly import the java.lang package in java and we won't need to 
// add the import statement. So, that we can use all classes that has been created inside 
// java.land package.

public class SingleInheritance {
	void m1(){
		System.out.println("Inside m1()");
	}
	
	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		s.m1();
		
		// Also, all the java classes implicitly inherits (Single Inheritance) the Object 
		// class from java.lang package.
		
		System.out.println(s.hashCode());
		System.out.println(s.getClass());
	}
}
