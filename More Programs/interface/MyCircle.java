package com.interfacea;

public class MyCircle implements Circle, CircleTwo{
	public float radius;
	
	public MyCircle(float radius) {
		this.radius = radius;
	}
	
	// If the method of both interfaces have same signature, then we have to implement
	// only one method in the implementation class.
	// If the methods have different parameters, then we have to implement both methods
	// in the implementation class.
	// If the method of either of the interface have the different return type, then we
	// can only implement one method in the implementation class.
	
	@Override
	public void calculateArea() {
		System.out.println("Area of cirlce is: "+(pie*(radius * radius)));
	}
	
}
