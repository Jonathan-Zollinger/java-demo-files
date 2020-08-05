package week4;

import java.util.Scanner;

/* Class: Lab-4a: Factorial Fun
 * Name: Otavio Furtado & Jonathan Zollinger
 * Date: 5/13/2020
 * Description: calculates and prints the factorial of an integer which is provided by the user.
 * Instructors Name: Jeff Light */

//import scanner
import java.util.Scanner;

public class Lab4bPonder {
	
	public static void main(String[] args) {

		// Use Scanner for getting Input from user
		Scanner in = new Scanner(System.in);                           //Input Scanner

		System.out.print("Please enter a number: ");
		String input = in.nextLine();

		int num1 = Integer.parseInt(input);

		System.out.printf("You entered the number " + num1);
	    
	    
	  }//end main
}//end Lab4a