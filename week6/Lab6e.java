package week6;

/* Class: Lab-6e: forReverse() & whileReverse()
 * Name: Guilherme Silva & Jonathan Zollinger
 * Date: 5/30/2020
 * Description: This program will ask the user to enter something and then print out a reversed version of the user's input.
 * Instructors Name: Jeff Light */

//import scanner
import java.util.Scanner;

public class Lab6e 
{
	public static void main(String[] args) 
	{
		//define variables
		boolean gameAgain = false;
		
		String input = "";
		
		Scanner in = new Scanner(System.in);
		
		
		
		
		//print out objective
		System.out.print("This program will ask the user to enter something and then print out a reversed version of the user's input.\n\n");
		
		
		do
		{
			gameAgain = false;
			
			System.out.print("Please enter something:");
			input = in.nextLine();
			
			System.out.printf("  Using the for loop: The reverse of \"%s\" is: \"%s\" %n",input, reverseWithForLoop(input));
			System.out.printf("Using the while loop: The reverse of \"%s\" is: \"%s\" %n",input, reverseWithWhileLoop(input));
	
			gameAgain = runAgain("Do you want to run the program again? ");
			
			
		}while(gameAgain);
		
	}//end main
	
	public static String reverseWithForLoop(String text)
	{
		String reversedString = "";
		
		for (int i = text.length()-1; i >= 0; i --) 
		{
			reversedString = reversedString + text.charAt(i);
		}
		
		return reversedString;
				
	}//end reverseWithForLoop()
	
	
	public static String reverseWithWhileLoop(String text)
	{
		String reversedString = "";
		
		int i = text.length()-1;
		
		while (i >= 0)
		{
			reversedString = reversedString + text.charAt(i);
			i --;
		}
		
		return reversedString;
			
	}//end reverseWithWhileLoop()


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
