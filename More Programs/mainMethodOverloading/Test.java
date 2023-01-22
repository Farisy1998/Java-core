package mainmethodoverloading;

public class Test {

	public static void main(String[] args) {
		System.out.println("Default main()");
		main(new int[]{10, 20, 30});
	}
	
	public static void main(int[] args) {
		System.out.println("Overloaded main()");
	}

}
