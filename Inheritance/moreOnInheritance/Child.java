package moreOnInheritance;

public class Child extends Parent {

	int c, d;
	Child(int a, int b, int c, int d){
		super(a, b); // super method must be the first statement inside the constructor.
		this.c = c;
		this.d = d;
	}
	
	void displayData(){
		System.out.println("Parent's a = "+ super.a);
		System.out.println("Parent's b = "+ super.b);
		System.out.println("Child's c = "+ this.c);
		System.out.println("Child's d = "+this.d);
	}
	
	void f1(){
		System.out.println("Inside Child's f1()");
		super.f1();
	}
}
