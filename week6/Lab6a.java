package week6;

/* Class: Lab-6a: largestNumber()
 * Name: Guilherme Silva & Jonathan Zollinger
 * Date: 5/28/2020
 * Description: This program will ask the user for three numbers and determine which of the three is the largest.
 * Instructors Name: Jeff Light */

//import scanner
		import java.util.Scanner;

public class Lab6a 
{
	public static void main(String[] args) 
	{
		//define variables
		boolean gameAgain = false;
		
		//print out objective
		System.out.print("This program will ask the user for three numbers and determine which of the three is the largest.\n\n");
		
		do
		{
			gameAgain = false;
			int num1 = 0, num2 = 0, num3 = 0, mNum;
			
			num1 = validInt("Please enter the first number \t:");
			num2 = validInt("Please enter the second number \t:");
			num3 = validInt("Please enter the third number \t:");
			
			mNum = LargestNum(num1,num2,num3);
			
			System.out.printf("\nThe largest of the three numbers is: %d\n\n",mNum);
			
			//ask if they'd like to run the program again
			gameAgain = runAgain("Do you want to run the program again? ");
			
		}while(gameAgain);
		
	}//end main
	
	public static int LargestNum(int firstNum, int secondNum, int thirdNum)
	{
		int LargestNum;
		
		//determine max number
		if(firstNum >= secondNum && firstNum >= thirdNum)
		{
				LargestNum = firstNum;
			}else if(secondNum >= firstNum && secondNum >= thirdNum)
			{
				LargestNum = secondNum;
			}else 
			{
				LargestNum = thirdNum;
		}
		
		return LargestNum;
	}
	
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
		
	}//end validInt()
	
	
	/*
	this method asks for and provides a valid Double. it loops through data validation until the user
	enters proper input. this method requires the java.util.Scanner to be imported already 
	*/
	public static double validDouble(String prompt)
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
					System.out.print("Error: Please enter a whole number.\n\n");
					
				}//end catch of exception e
				
			}while(!valid);//end deposit do	
		
		//return the valid integer
		return validDouble;
		
	}//end validDouble()
	
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
	
	
	

}
