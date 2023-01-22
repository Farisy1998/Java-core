package overriding;

public class Overriding {

	public static void main(String[] args) {
//		Parent.doSomething();
//		Child.doSomething();
		
		Parent c1 = new Child();
		c1.display(); // If we access any method with an object that is type Parent class
		// and instance of Child class. Then the method of Child class will be accessed.
		// Bcuz, methods of a class are accessed based on the object is created as the 
		// instance of which class.
		
		System.out.println(c1.str);	// On other hand, if we access any variable with an 
		// object that is type Parent class and instance of Child class. Then the variable 
		// of Parent class will be accessed. Bcuz, variables are accessed based on which
		// type is placed on the leaf hand side of the variable name(ie, Parent obj);
	}

}
