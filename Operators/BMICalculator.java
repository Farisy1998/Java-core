
public class BMICalculator {

	public static void main(String[] args) {
		// bmi = weight in kg / (height * height) in meter

		int weight = 52;
		double height = 5.5;

		double heightInMeter = height * 0.4536;

		double bmi = weight / (heightInMeter * heightInMeter);

		System.out.println("BMI is: " + bmi);
	}

}
