
public class NonStaticMembersDemo {
	int num;

	NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}

	// The non-static block will executed just before the constructor gets
	// called and just after the main method is gets called.

	// The non-static block get executed when every time we create an object of
	// a class and where as the static block get executed only once when the
	// class is loaded.
	{
		System.out.println("Inside the non-static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main");
		NonStaticMembersDemo demo = new NonStaticMembersDemo();
		demo.doSomething();
	}
	
	static{
		System.out.println("Inside the static block");
	}
	
	void doSomething(){
		System.out.println("Inside doSomething");
	}
}
