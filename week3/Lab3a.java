package week3;
/* Class: Lab-3a: Shirt Sizes
 * Name: Otavio Furtado & Jonathan Zollinger
 * Date: 5/5/2020
 * Description: figures shirt size from given chest dimension
 * Instructors Name: Jeff Light */

//import scanner
import java.util.Scanner;


public class Lab3a {
	public static void main(String[] args) {
		
		//print purpose of the program
		System.out.println("In this program, we will determine a man's shirt size based on the measurement in inches of the customer's chest.\n");
	
		//define scanner variable
		Scanner input = new Scanner(System.in);
		
		//define shirt sizes
		int small = 38;
		int medium = 40;
		int large = 43;
		int xLarge = 46;
		String shirtSize = "whatever";
		
		//request the customer's chest measurement
		System.out.print("Please enter the customer's chest measurement in inches: ");
		int chest = Integer.parseInt(input.nextLine());
		
		//determine the size of shirt the customer needs with an if-else-if ladder
		if (chest < small) {
			shirtSize = "S";
		}	else if (chest >= small && chest < medium) {
			shirtSize = "M";
		}	else if (chest >= medium && chest < large) {
			shirtSize = "L";
		}	else if (chest >= large && chest < xLarge) {
			shirtSize = "XL";
		}	else {
			shirtSize = "XXL";
		}
		//print resultant size
			System.out.println("A customer with a chest measurement of " + chest + " inches needs to order a size " + shirtSize + ".");
	
	}//end public static void main

}//end lab3a
