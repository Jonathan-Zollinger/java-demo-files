package week5;

/* Class: Lab-5i: Process a Range of Validated Numbers
 * Name: Jonathan Zollinger
 * Date: 5/23/2020
 * Description: The Program will ask for 3 numbers, then the program will multiply each_
 * 					number between the starting number and ending number by the multiplier.
 * Instructors Name: Jeff Light */

//import libraries
import java.util.Scanner;

public class Lab5i 
{
	public static void main(String[] args) 
	{
		//define variables
		Scanner	in 			= new Scanner(System.in);
		
		String 	input 		= "";//input from scanner - always changed to double or integer, never pulled in as any other data type
		String 	playAgain 	= "";
				
		boolean	gameAgain 	= false;//for looping back and playing program again
		boolean	valid		= false;//for validating data entry do-while loops
		
		int 	sNum		= 0;//starting value
		int		eNum		= 0;//ending value
		int		mNum		= 0;//multiplier value
		
		//print program objective
		System.out.print("This program will ask the user for three numbers:\n" + 
				"\t* A starting number\n" + 
				"\t* An ending number\n" + 
				"\t* A multiplier\n" + 
				"The program will multiply each number between the starting number and ending number by the multiplier.\n\n");
		
		do//repeat program if the user wants to repeat again
		{
			input 		= "";//input from scanner - always changed to double or integer, never pulled in as any other data type
			playAgain 	= "";
					
			gameAgain 	= false;//for looping back and playing program again
			valid		= false;//for validating data entry do-while loops
			
			sNum		= 0;//starting value
			eNum		= 0;//ending value
			mNum		= 0;//multiplier value
			
		
			//ask for each number
			do//sNum entry
			{
				System.out.print("Please enter the starting number\t: ");
				input = in.nextLine();
				valid = false;
				//perform input validation
				try
				{
					sNum = Integer.parseInt(input);
					valid = true; //designate to exit do-while loop
				}catch (Exception e) //catch-all 
				{				    
					System.out.print("Error: Please enter a whole number.\n");
				}
				
			}while(!valid);//will repeat until they've entered good information
			
			do//eNum entry
			{
				System.out.print("Please enter the ending number number\t: ");
				input = in.nextLine();
				valid = false;
				//perform input validation
				try
				{
					eNum = Integer.parseInt(input);
					valid = true; //designate to exit do-while loop
				}catch (Exception e) //catch-all 
				{				    
					System.out.print("Error: Please enter a whole number.\n\n");
				}
				
			}while(!valid);//will repeat until they've entered good information
			
			do//mNum entry
			{
				System.out.print("Please enter the multiplier\t\t: ");
				input = in.nextLine();
				valid = false;
				//perform input validation
				try
				{
					mNum = Integer.parseInt(input);
					valid = true; //designate to exit do-while loop
				}catch (Exception e) //catch-all 
				{				    
					System.out.print("Error: Please enter a whole number.\n\n");
				}
				
			}while(!valid);//will repeat until they've entered good information
			
			//loop through the whole set and print out results with each loop
			for (int i = sNum; i <= eNum; i ++) 
			{
				System.out.printf("%nMultiplying %d by %d results in:%4d",i,mNum,i*mNum);
			}//end compute and print main body for loop
			
			
			
			//ask if they'd like to play again
			do 
			{									
				System.out.print("\n\n\nWould you like to play again? (Y/N): ");   
		    	playAgain = in.nextLine();
		    	valid = false;
				
				//validate the user put in "Y" or "N"
		
				if(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) 
				{
					valid = true;
					if(playAgain.equalsIgnoreCase("Y")) 
					{
						gameAgain = true;	
						System.out.print("\n\n");
					}else 	
					{
						System.out.print("\nThanks for playing!");																	
					}//end Y/N else
				}else 	
				{
					System.out.println("Error: Please answer with a 'Y' or 'N'.\n");										
				}//end Y-N validation else
									
			}while(!valid);//end play again question
					
		
		}while(gameAgain);
		
	}// end main
}//end Lab5i
