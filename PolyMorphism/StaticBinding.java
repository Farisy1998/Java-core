
public class StaticBinding {
	
	public static int add(int a, int b){
		return a+b;
	}

	public static float add(float a, float b){
		return a+b;
	}
	
	public static int add(int a, int b, int c){
		return a+b+c;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticBinding.add(20, 30));
		System.out.println(StaticBinding.add(30.23F, 20.65F));
		System.out.println(StaticBinding.add(20, 30, 40));
	}

}
