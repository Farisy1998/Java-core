package autopromotion;

public class AutoPromotion {
	// In Auto Promotion the immediate next promoted data type will be used. An also if
	// there is no specific type is found, then it's parent type will be executed (see in
	// print method with object class type parameter).

	static void print(char ch){
		System.out.println("Char version "+ch);
	}
	
	static void print(float num){
		System.out.println("Float version "+num);
	}
	
//	static void print(String str){
//		System.out.println("String version "+str);
//	}
	
	static void print(Object obj){
		System.out.println("Object version "+obj);
	}
	
	public static void main(String[] args) {
		AutoPromotion.print(1236);
		AutoPromotion.print(123L); 
		AutoPromotion.print("hello");
	}

}
