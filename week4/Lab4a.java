package week4;

import java.util.Scanner;

/* Class: Lab-4a: Input validation
 * Name: Otavio Furtado & Jonathan Zollinger
 * Date: 5/13/2020
 * Description: calculates and prints the factorial of an integer which is provided by the user.
 * Instructors Name: Jeff Light */

//import scanner
import java.util.Scanner;

public class Lab4a {
	
	public static void main(String[] args) {

		//define scanner variable
				Scanner input = new Scanner(System.in);	

				//ask for input
			    System.out.print("Please enter the number for which you wish to calculate its factorial: ");
			    int num = Integer.parseInt(input.nextLine());
			    int factorial = 1;
			    int oNum = num;
			    
			    while(num > 0) {
			    	factorial = factorial * num;
			    	num --;   	
			    }//end while
			    
			    System.out.println("The factorial of " + oNum + " (also written \"" + oNum + "!\") is "+ factorial + ".");
	    
	    
	  }//end main
}//end Lab4b