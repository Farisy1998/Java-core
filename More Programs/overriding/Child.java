package com.overriding;

public class Child extends Parent {
	
	String str = "Child";
	
	static void doSomething(){
		System.out.println("Inside Child method");
	}
	
	void display(){
		System.out.println("Inside Child display()");
	}
}
