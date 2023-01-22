package abstractClass;

public abstract class BMW {
	// We can't create a instance of abstract class.
	// An abstract class can have 0 or 1 or more abstract methods.
	void commonFun(){
		System.out.println("Inside commonFun()");
	}
	
	abstract void accelerate();
}
