package interfaces;

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("Started");
	}

	@Override
	public void go() {
		System.out.println("On go...");
	}

	@Override
	public void stop() {
		System.out.println("Stopped");
	}

}
