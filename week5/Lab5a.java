package week5;

/* Class: Lab-5a: Whole Numbers Divisible by X
 * Name: Guilherme Silva & Jonathan Zollinger
 * Date: 5/19/2020
 * Description: In this program, we will display a series of numbers divisible by an integer specified by the user between two values, also given by the 
 * 					user.
 * Instructors Name: Jeff Light */

//import scanner
import java.util.Scanner;

public class Lab5a 
{
	public static void main(String[] args) 
	{
		
		//define variables
		Scanner in = new Scanner(System.in);
		String input;
		String playAgain = "";
		int sNum = 0;
		int eNum = 0;
		int tNum = 0;
		boolean valid1 		= false;
		boolean valid2 		= false;
		boolean valid3 		= false;
		boolean valid4 		= false;
		boolean gameAgain 	= false;
	
		do
		{
			valid1 		= false;
			valid2 		= false;
			valid3 		= false;
			valid4 		= false;
			gameAgain 	= false;
			
				
			//print out program objective
			System.out.print("In this program, we will display a series of numbers divisible by an integer specified by the user.\n\n");
		
	
			//ask for first number and perform input validation
			do //do #1
			{
						
				System.out.print("Enter the starting number: ");
				input = in.nextLine();
				
				//perform input validation
				try
				{
					sNum = Integer.parseInt(input);
					valid1 = true;
					
				}catch (Exception e) 
				{				    
					System.out.print("Error: Please enter a whole number.\n\n");
				}
				
				
			}while (!valid1);//end do #1
			
			//ask for first number and perform input validation
				do //do #2
				{
							
					System.out.print("Enter the ending number: ");
					input = in.nextLine();
					
					//perform input validation
					try
					{
						//verify that eNum is greater than sNum
						if	(Integer.parseInt(input) > sNum) 
						{
							eNum = Integer.parseInt(input);
						}
							
						valid2 = true;
						
					}catch (Exception e) 
					{				    
						System.out.print("Error: Please enter a whole number.\n\n");
					}
					
					
				}while (!valid2);//end do #2
				
				//ask for first number and perform input validation
				do //do #3
				{
							
					System.out.print("Enter the test number: ");
					input = in.nextLine();
					
					//perform input validation
					try
					{
						tNum = Integer.parseInt(input);
						valid3 = true;
						
					}catch (Exception e) 
					{				    
						System.out.print("Error: Please enter a whole number.\n\n");
					}
					
					
				}while (!valid3);//end do #3
				
				
				
				
			
			//print expectation
				System.out.printf("%n%nHere are the numbers between %d and %d that are divisible by %d:%n", sNum, eNum, tNum);
				
			for (int i = sNum; i <=eNum; i ++)	
			{
				if(i % tNum == 0) 
				{
					System.out.println(i);
				}else 
				{
					continue;
				}
			}//end for loop
			
			//ask if they'd like to play again
			do 
			{									
					System.out.print("\nWould you like to play again? ");   
			    	playAgain = in.nextLine();
					
					//validate the user put in "Y" or "N"
			
					if(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) 
					{
						valid4 = true;
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
					
			}while(!valid4);//end play again question
			
		}while(gameAgain);//play again do/while
	
	}//end main
}//end Lab5a








