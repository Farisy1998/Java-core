
public class DynamicBinding {

	public static void main(String[] args) {
		MACBook m1 = new MACBookPro();	// Up-Casting - converting child class object to
										// parent class object.
		MACBookPro m3 = (MACBookPro) m1;// Down-Casting - Converting parent class object
										// to child class object.
		m1.start();
		MACBook m2 = new MACBookAIR();
		m2.start();
		m1.shutdown();
		m2.shutdown();	
	}

}
