
public class SwitchCaseCommonLogic {

	public static void main(String[] args) {
		int a = 1;
		
		switch(a){
		case 1:
		case 2:
		case 3:
			System.out.println("Common logic");
			break;
		default:
			System.out.println("No case matches");
		}
	}

}
