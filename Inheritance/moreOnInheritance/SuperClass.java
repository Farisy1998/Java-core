package moreOnInheritance;

public class SuperClass {

	SuperClass(){
		this(10);
		System.out.println("Inside no arg SuperClass constructor");
	}
	
	SuperClass(int a){
		System.out.println("Inside arg SuperClass constructor");
	}
}
