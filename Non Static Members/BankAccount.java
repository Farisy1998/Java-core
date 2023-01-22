
public class BankAccount {
	static String bankName = "HDFC";	// Internally the static variables are stored in method
										// area by the JVM
	String accountHolder = "Salmanul Farisy K";
	int accountNumber = 132456798;
	float balance = 1000.0F;
	
	public static void main(String[] args) {
		// Internally the local variables are store inside a stack.
		// Also the JVM will not automatically initialize a local variable. As we as a programmer
		// have to do it. Otherwise the java compiler will generate an error while we start to
		// use it on out program.
		double loanInterestRate = 7.5;
		System.out.println(loanInterestRate);
		System.out.println(BankAccount.bankName);
		BankAccount bankAccount = new BankAccount();
		System.out.println(bankAccount.accountHolder);
		System.out.println(bankAccount.balance);
	}

}
