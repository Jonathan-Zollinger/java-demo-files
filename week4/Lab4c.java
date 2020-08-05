package week4;

/* Class: Lab-4c: Non-numeric Input Validation
 * Name: Otavio Furtado & Jonathan Zollinger
 * Date: 5/14/2020
 * Description: this program performs text validation on user input Y or N from given question
 * Instructors Name: Jeff Light */

//import scanner
import java.util.Scanner;


public class Lab4c {

	public static void main(String[] args) {

		//define scanner variable
		Scanner in = new Scanner(System.in);
		
		//define variables
		boolean valid = false;
		
		do {
			//ask for user input
			System.out.print(" ");
			String input = in.nextLine();
			
			//perform input validation
			try
			{
				Integer.parseInt(input);
				valid = true;
				
			}catch (Exception e) 
			{				    
				System.out.print("Error: Please enter a whole number.\n\n");
			}
		
		}while (!valid);
		
	}//end main
	
}//end Lab4c
