
public class StringConcat {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "xyz";

		int a = 10, b = 20, c = 30;
		
		System.out.println(str1+str2);
		System.out.println(a+b+c);
		System.out.println(str1+a+b+c);
		System.out.println(a+b+str1+c);
		System.out.println(a+b+c+str1);
	}

}
