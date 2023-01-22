package finalKeyword;

// A final class cannot be extended or inherited.
public final class A {
	// A final field cannot be reassigned. Final keyword in java is used to create constants,
	// final field can be static.
	final static float pie = 3.14F;
	// OR
	// Through a constructor.
//	final float pie;
//	A(){
//		this.pie = 3.14F;
//	}
	
	// A final method cannot be over ridden but overloaded.
	public final void display(int a){
		System.out.println("Inside final display()");
	}
	
	public void display(String str){
		System.out.println("Inside display()");
	}
	
	public static void main(String[] args) {
		System.out.println(A.pie);
	}
}
