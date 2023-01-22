
public class GradingApplication {

	static double averageMark;

	public static void main(String[] args) {
		int maths = 95, physics = 93, chemistry = 91;
		
		boolean isPassed = maths >= 35 ? true : false && physics >= 35 ? true : false && chemistry >= 35 ? true : false;

		if (isPassed) {
			int totalMark = maths + physics + chemistry;
			averageMark = calulateAverage(totalMark);

			if (averageMark > 69)
				printMessage("Grade - A");
			else if (averageMark <= 69 && averageMark > 59)
				printMessage("Grade - B");
			else
				printMessage("Grade - C");
		} else
			printMessage("Failed");
	}

	static double calulateAverage(int totalMark) {
		return totalMark / 3;
	}

	static void printMessage(String message) {
		System.out.println(message);
	}

}
