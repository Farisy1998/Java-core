package com.overriding;

public class Parent {

	String str = "Parent";
	
	static void doSomething(){
		System.out.println("Inside Parent method");
	}

	void display(){
		System.out.println("Inside Parent display()");
	}
}
