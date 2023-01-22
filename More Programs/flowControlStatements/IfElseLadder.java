package com.flowcontrolstatements;

public class IfElseLadder {

	public static void main(String[] args) {
		String choice = "check balance";

		if (choice.equals("check balance"))
			System.out.println("Check Balance");
		else if (choice.equals("change pin"))
			System.out.println("Change Pin");
		else if (choice.equals("withdraw cash"))
			System.out.println("Withdraw Cash");
		else if (choice.equals("deposite cash"))
			System.out.println("Deposite Cash");
		else
			System.out.println("Time Out");
	}

}
