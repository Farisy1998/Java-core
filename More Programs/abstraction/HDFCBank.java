package abstraction;

// With abstract class concept we can't extends multiple classes.
public class HDFCBank extends Bank {

	void bankServerFun() {
		System.out.println("Connection successfull");
		System.out.println("Cash debited.");
	}
	

}
