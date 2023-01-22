package moreOnInheritance;

public class ChildClass extends SuperClass {

	ChildClass(){
		this(10);
		System.out.println("Inside no arg ChildClass constructor");
	}
	
	ChildClass(int b){
		super();
		System.out.println("Inside arg ChildClass constructor");
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		
	}
}
