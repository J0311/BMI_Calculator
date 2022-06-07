// Simple application which calculates user BMI

import java.text.DecimalFormat;
import java.util.Scanner;


public class BMICalculator {
	
// Weight (lbs)
// Height (in) ^ 2 * 703

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.println("Please enter height in inches: ");
		double height = input.nextDouble();
		
		input.close();
		
		double bmi = weight / Math.pow(height, 2) * 703;
		
// Instantiate a DecimalFormat object so we can call the format method
// and pass our bmi variable double through do display one decimal place
		
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println("Your BMI is: " + df.format(bmi));
	}
}
