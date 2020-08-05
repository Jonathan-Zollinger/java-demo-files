package week6;

import java.util.Scanner;

/* Class: Lab-6c: isBetween()
 * Name: Guilherme Silva & Jonathan Zollinger
 * Date: 5/30/2020
 * Description: This program will ask the user for 3 numbers and determine if the second number lies between the first and the third.
 * Instructors Name: Jeff Light */

public class Lab6c 
{
	
	public static void main(String[] args)
		{
			//define variables
			boolean gameAgain = false;
			int num1 = 0, num2 = 0, num3 = 0;
			
			//print out objective
			System.out.print("This program will ask the user for 3 numbers and determine if the second number lies between the first and the third.\n\n");
			
			
			do
			{
				gameAgain = false;
				
				num1 = validInt("\t\t\t      Please enter the low number: ");
				num2 = validInt("Please enter the number to be tested (the between number): ");
				num3 = validInt("\t\t\t     Please enter the high number: ");
				
				if(isBetween(num1,num2,num3))
				{
					System.out.printf("\n%d lies between the numbers %d and %d.\n\n",num2,num1,num3);
				}else 
				{
					System.out.printf("\n%d DOES NOT lie between the numbers %d and %d.\n\n",num2,num1,num3);
				}
				
				
				//ask if they'd like to run the program again
				gameAgain = runAgain("Do you want to run the program again? ");
				
				
			}while(gameAgain);
			
		}//end of main()
	
	
	
	/*
	 * 
	 */
	public static boolean isBetween(int firstNum, int secondNum, int thirdNum)
	{
		if(secondNum >= firstNum && secondNum <= thirdNum) 
		{
			return true;
		}else 
		{
			return false;
		}
	}//end isbetween()
	
	
	/*
	this method asks for and provides a valid integer. it loops through data validation until the user
	enters proper input. this method requires the java.util.Scanner to be imported already 
	*/		
	public static int validInt(String prompt)	
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
					System.out.print("Error: Please enter a whole number.\n\n");
					
				}//end catch of exception e
				
			}while(!valid);//end deposit do	
		
		//return the valid integer
		return validInt;
		
	}//end of validInt
	
	/*
	this method asks for and provides a valid 'Y' or 'N' input. it loops through data validation until the user
	enters proper input. this method requires the java.util.Scanner to be imported already 
	*/
	public static boolean runAgain(String prompt)
	{
		
		String playAgain = "";
    	boolean valid = false;
    	boolean runAgain = false;
    	
		do //provide Yes - No input prompt
			{		
				Scanner in = new Scanner(System.in);	
				System.out.print(prompt);   
		    	playAgain = in.nextLine();
		    	valid = false;
				
				//validate the user put in "Y" or "N"
		
				if(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) 
				{
					valid = true;
					if(playAgain.equalsIgnoreCase("Y")) 
					{
						runAgain = true;	
						System.out.print("\n\n");
					}else 	
					{
						System.out.print("\nThanks for playing!");																	
					}//end Y/N else
				}else 	
				{
					System.out.println("Error: Please answer with a 'Y' or 'N'.\n");										
				}//end Y-N validation else
					
			}while(!valid);//end Yes - No input prompt
		
		return runAgain;
	}//end runAgain

}// end of 6c()
