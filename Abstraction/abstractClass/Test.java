package abstractClass;

public class Test {

	public static void main(String[] args) {
		FiveSeries fiveSeries = new FiveSeries();
		fiveSeries.commonFun();
		fiveSeries.accelerate();
		
		ThreeSeries threeSeries = new ThreeSeries();
		threeSeries.commonFun();
		threeSeries.accelerate();
	}

}
