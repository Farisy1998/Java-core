
public class Demo {
	
	// We cannot call a non-static method or field from a static method
	
	static Demo obj = new Demo();
	int x;

	static {
		System.out.println(obj);
		Demo.obj = Demo.init();
	}

	public static void main(String[] args) {
		System.out.println(Demo.obj);
	}

	static Demo init() {
		return new Demo();
	}
}
