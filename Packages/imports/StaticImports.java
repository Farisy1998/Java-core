package com.imports;

// static imports
import static java.lang.System.out;
import static java.lang.Integer.*;

public class StaticImports {

	public static void main(String[] args) {
		
		out.println("Hello World");
		
		String str = "23";
		System.out.println(str);
		
		int num = parseInt(str);
		
		System.out.println(num);
	}

}
