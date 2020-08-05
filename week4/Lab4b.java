package week4;

/* Class: Lab-4a: Factorial Fun
 * Name: Otavio Furtado & Jonathan Zollinger
 * Date: 5/13/2020
 * Description: calculates and prints the factorial of an integer which is provided by the user.
 * Instructors Name: Jeff Light */

//import scanner
import java.util.Scanner;

public class Lab4b {
	
	public static void main(String[] args) {

		//define scanner variable
		Scanner in = new Scanner(System.in);	
		
		//perform step 3
		String input = "";
		
		//perform step 4
		int num1 = 0, num2 = 0, num3 = 0;
		
		//perform step 5
		boolean valid = false;
		
		/* question for step 7
		1: we need to verify that the variable "valid" hasn't changed. if we were to continue 
				with no validation of the valid variable, the loop would theoretically never stop
		2.the while condition is looking for any time valid is NOT false (aka true). once the variable not-valid is false, then we
		 		know the condition has changed. 
		*/
		
		//perform step 6
		do {
			
			//perform step 8
			System.out.print("Please enter a number: ");
			
			//perform step 9
			input = in.nextLine();
			
			//perform step 10
			try {
				//perform step 11 
				num1 = Integer.parseInt(input);
				
				//perform step 12
				valid = true;
				 
			//perform step 13 
			}catch (Exception e) {
				
				System.out.print("Error: Please enter a whole number.\n");
				
			}//end of try/catch
			
			
		}while (!valid);	
		
		
		//perform step 14
		num2 = num1 + 1000;
		num3 = num1*2;
			
		//perform step 15
		
		System.out.println("num1 = " + num1 + ".");
		System.out.println("num2 = " + num2 + ".");
		System.out.println("num3 = " + num3 + ".");
		
		/*step 16
		 * we figure we did a do while loop because we wanted to first perform some code no matter the user input - the rest of the code
				was dependent on the input being a valid data type - so we only needed to loop given that condition.
		*/
	    
	  }//end main
}//end Lab4a