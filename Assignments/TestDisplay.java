
public class TestDisplay {

	public static void main(String[] args) {
		TouchScreen hpScreen = new HPNotebook();
		hpScreen.scroll();
		hpScreen.click();
		
		TouchScreen dellScreen = new DellNotebook();
		dellScreen.scroll();
		dellScreen.click();
	}

}
