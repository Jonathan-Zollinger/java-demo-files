package week7;

/* Class: Lab-7i: getValidX()
 * Name: Jonathan Zollinger
 * Date: 6/11/2020
 * Instructors Name: Jeff Light */

import java.util.Scanner;


public class Lab7i {


public static void main(String[] args) {
	 //Play the game until the user says they don't want to play again.
	 String playAgain = "Y";

	 while (playAgain.equalsIgnoreCase("Y")) {
	  //Get an integer from the user
	  int intNum = getValidInt("Please enter a whole number: ", "Invalid response. Only whole numbers are acceptable.");
	  System.out.printf("The whole number your entered was: %d.\n", intNum);
	  System.out.println("Now we will test your whole number in a math equation...");
	  System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n", intNum, intNum + 10);
	  System.out.println();

	  //Get a floating-point from the user
	  double doubleNum = getValidDouble("Please enter a decimal-point number: ", "Invalid response. Only decimal-point numbers are acceptable.");
	  System.out.printf("The float your entered was: %f.\n", doubleNum);
	  System.out.println("Now we will test your floating-point number in a math equation...");
	  System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n", doubleNum, doubleNum + 10);
	  System.out.println();

	  //Get a 'Y' or 'N' from the user
	  playAgain = getValidYN("Would you like to play again? (Y/N): ", "Invalid response.  Please answer with a 'Y' or 'N'");
	  System.out.println();
	 } // end of while (playAgain.equalsIgnoreCase("y"))
	} // end of Main()

/*
this method asks for and provides a valid Double. it loops through data validation until the user
enters proper input. this method requires the java.util.Scanner to be imported already 
*/
public static double getValidDouble(String prompt, String errorPrompt)
{
	double validDouble = 0;
	boolean valid = false;
	do
		{
			Scanner in = new Scanner(System.in);
			
			System.out.print(prompt);
			String input = in.nextLine();
			valid = false;

			//perform input validation
			try
			{
				validDouble = Double.parseDouble(input);
				valid = true;
							
			}catch (Exception e) 
			{				    
				System.out.print(errorPrompt + "\n\n");
				
			}//end catch of exception e
			
		}while(!valid);//end deposit do	
	
	//return the valid integer
	return validDouble;
	
}//end validDouble()

/*
this method asks for and provides a valid integer. it loops through data validation until the user
enters proper input. this method requires the java.util.Scanner to be imported already 
*/
public static int getValidInt(String prompt, String errorPrompt)	
{								
	int validInt = 0;
	boolean valid = false;
	do
		{
			Scanner in = new Scanner(System.in);
			
			System.out.print(prompt);
			String input = in.nextLine();
			valid = false;

			//perform input validation
			try
			{
				validInt = Integer.parseInt(input);
				valid = true;
							
			}catch (Exception e) 
			{				    
				System.out.print(errorPrompt + "\n\n");
				
			}//end catch of exception e
			
		}while(!valid);//end deposit do	
	
	//return the valid integer
	return validInt;
	
}//end validInt()

public static String getValidYN(String prompt, String errorPrompt)
{
	
	String playAgain 	= "";
	
	boolean valid 		= false;
	boolean runAgain 	= false;
	
	Scanner in 			= new Scanner(System.in);
	
	do //provide Yes - No input validation
	{		
		System.out.print(prompt);   
    	playAgain = in.nextLine();
    	valid = false;
		
		//validate the user put in "Y" or "N"

		if(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) 
		{
			valid = true;	
		}else 	
		{
			System.out.println(errorPrompt + "\n");										
		}//end Y-N validation else
			
	}while(!valid);//end Yes - No input prompt
	
	//determine input boolean value
//	if(playAgain.equalsIgnoreCase("Y")) 
//	{
//		runAgain = true;	
//		System.out.print("\n\n");
//	}else 	
//	{
//		System.out.print("\nThanks for playing!");	
//		runAgain = false;//already set to false, but just to reiterate that this is false.
//	}//end Y/N else
	
	return playAgain;
}//end getvalidYN()
}