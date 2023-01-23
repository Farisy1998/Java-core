package flowControlStatements;

public class SwitchCase {

	public static void main(String[] args) {
		String choice = "deposite cash";

		switch (choice) {
		default:
			System.out.println("Time Out");
		case "check balance":
			System.out.println("Check Balance");
			break;
		case "change pin":
			System.out.println("Change Pin");
			break;
		case "withdraw cash":
			System.out.println("Withdraw Cash");
			break;
		case "deposite cash":
			System.out.println("Deposite Cash");
			break;
		}
	}

}
