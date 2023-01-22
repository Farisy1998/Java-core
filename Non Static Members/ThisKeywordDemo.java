
public class ThisKeywordDemo {
	int x;
	
	public ThisKeywordDemo() {
		// 'this' keyword can be only used in non static context
		System.out.println(this);
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		new ThisKeywordDemo();
		new ThisKeywordDemo();
	}
}
