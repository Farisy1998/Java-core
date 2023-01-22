package abstraction;

public abstract class Bank {

	abstract void bankServerFun();
	
	void atmFun(){
		System.out.println("Insert Card");
		System.out.println("Connecting....");
		bankServerFun();
	}
}
