package com.addition;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = Integer.parseInt(scanner.next());
		System.out.println("Enter second number");
		int num2 = Integer.parseInt(scanner.next());
		scanner.close();
		System.out.println("The sum is: " + (num1 + num2));
	}

}
