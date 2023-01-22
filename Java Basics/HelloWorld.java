
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	// The code written in the static block will be executed once, before the
	// main method is called
	static {
		System.out.println("Inside the static block-1");
	}

	static {
		System.out.println("Inside the static block-2");
	}

}
