
public class SwitchCase {

	public static void main(String[] args) {
		int x = 1;
		final int y = 2;
		
		switch(y){
		case 1: System.out.println("case 1");
				break;
		case y: System.out.println("case 2");	// In-order to use a identifier as case 
												// we must declare it as final.
				break;
		case 3:
			System.out.println("case 3");
		default: System.out.println("No cases matches");
		}
	}

}
