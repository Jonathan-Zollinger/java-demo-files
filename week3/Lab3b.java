package week3;

/* Class: Lab-3b: Calculating BMI
 * Name: Otavio Furtado & Jonathan Zollinger
 * Date: 5/7/2020
 * Description: figures bmi from given weight and height
 * Instructors Name: Jeff Light */

//import scanner
import java.util.Scanner;

public class Lab3b {
		public static void main(String[] args) {
		
		//print purpose of the program
		System.out.println("In this program we will calculate a person's BMI.\n");
	
		//define scanner variable
		Scanner input = new Scanner(System.in);
	
		//request a person's height & weight
		System.out.print("Please enter a person's height in inches: ");
		double impHeight = Integer.parseInt(input.nextLine());
		System.out.print("Please enter a person's weight in pounds: ");
		double impWeight = Double.parseDouble(input.nextLine());
		
		//convert input into meters and kilograms
		double weight = 0.45359237 * impWeight;
		double height = 0.0254 * impHeight;
		
		//calculate BMI
		double bmi = weight / (height * height);
		
		//determine bmi interpretation
		String bmiClass = "replace me";
				if	(bmi < 18.5) {
					bmiClass = "Underweight";			
				} else if (bmi >= 18.5 && bmi < 25) {
					bmiClass = "Normal";					
				} else if (bmi >= 25 && bmi < 30) {
					bmiClass = "Overweight";
				} else {
					bmiClass = "Obese";					
				}
		
		//print results
				System.out.print("The person's BMI is: " + bmi + ". The person has a BMI classification of: " + bmiClass);
						
		}//end public static void main
	
}//end public class Lab3b
