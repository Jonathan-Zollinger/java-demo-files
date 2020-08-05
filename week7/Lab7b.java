package week7;

import java.util.Scanner;

/* Class: Lab-7b: Pythagorean Theorem
 * Name: Guilherme Silva & Jonathan Zollinger
 * Date: 6/4/2020
 * Description: This program will use the Pythagorean Theorem to calculate the length of one side of a right triangle given the other two sides.
					The program will ask the user which side they wish to calculate and the lengths of the other two sides.
					Assume that the three sides are called a, b, and c where c is the hypotenuse (the side opposite the right angle)
 * Instructors Name: Jeff Light */

public class Lab7b 
{
	public static void main(String[] args) 
	{
		
		//define variables
		String playAgain = "";
		String input	 = "";

		boolean valid 		= false;
    	boolean runAgain 	= false;
				
		Scanner in = new Scanner(System.in);
		
		//print program objective
		System.out.print("This program will use the Pythagorean Theorem to calculate the length of one side of a right triangle given the other two sides.\n" + 
				"The program will ask the user which side they wish to calculate and the lengths of the other two sides.\n" + 
				"Assume that the three sides are called a, b, and c where c is the hypotenuse (the side opposite the right angle)");
		
		do
		{
			runAgain 	= false;
			valid 		= false;
			
		do //ask for which side of the triangle they'd like to calculate & perform input validation
		{		
			valid = false;
			System.out.print("\n\nWhich side of the triangle do you wish to calculate? (a/b/c): ");   
	    	playAgain = in.nextLine();
	    				
			//validate the user put in a,b or c
	
			if(playAgain.equalsIgnoreCase("A") || playAgain.equalsIgnoreCase("B") || playAgain.equalsIgnoreCase("C")) 
			{
				valid = true;
				if(playAgain.equalsIgnoreCase("A")) 
				{
					calculateSideA();
					System.out.print("\n\n");
				}else if(playAgain.equalsIgnoreCase("B"))
				{
					calculateSideB();
					System.out.print("\n\n");
				}else if(playAgain.equalsIgnoreCase("C"))
				{
					calculateSideC();
					System.out.print("\n\n");
				}
			}else 	
			{
				System.out.println("Error: Please answer with a 'A', 'B' or 'C'.\n");										
			}//end a,b,c validation
				
		}while(!valid);//end Yes - No input prompt
		
    	
		do //provide Yes - No input prompt
			{		
				System.out.print("Would you like to play again? (Y/N): ");   
		    	playAgain = in.nextLine();
		    	valid = false;
				
				//validate the user put in "Y" or "N"
		
				if(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) 
				{
					valid = true;	
				}else 	
				{
					System.out.println("Error: Please answer with a 'Y' or 'N'.\n");										
				}//end Y-N validation else
					
			}while(!valid);//end Yes - No input prompt
		
		if(playAgain.equalsIgnoreCase("Y")) 
		{
			runAgain = true;	
			System.out.print("\n\n");
		}else 	
		{
			System.out.print("\nThanks for playing!");																	
		}//end Y/N else
		
	}while(runAgain);
		
	}//end main
	
	public static void calculateSideA()
	{
		double A = 0, C = 0, B = 0;
		
		B = getSideLength("B");
		C = getSideLength("C");
		
		A = Math.sqrt(Math.pow(C, 2) - Math.pow(B,2));
		
		System.out.print("A right triangle with sides 'B' = " + B + " and 'C'(hypotenuse) = "+ C + ", has a side 'A' which has a length of: " + A);
		
	}//end calculateSideA
	
	public static void calculateSideB()
	{
		double A = 0, C = 0, B = 0;
		
		A = getSideLength("A");
		C = getSideLength("C");
		
		B = Math.sqrt(Math.pow(C, 2) - Math.pow(A,2));
		
		System.out.print("A right triangle with sides 'A' = " + A + " and 'C'(hypotenuse) = "+ C + ", has a side 'B' which has a length of: " + B);
	}//end calculateSideB
	
	public static void calculateSideC()
	{
		double A = 0, C = 0, B = 0;
		
		A = getSideLength("A");
		B = getSideLength("B");
		
		C = Math.sqrt(Math.pow(A, 2) + Math.pow(B,2));
		
		System.out.print("A right triangle with sides 'A' = " + A + " and 'B' = "+ B + ", has a side 'C'(hypotenuse) which has a length of: " + C);
		
	}//end calculateSideC
	
	public static double getSideLength(String side)	
	{								
		double validSide = 0;
		boolean valid = false;
		do
			{
				Scanner in = new Scanner(System.in);
				
				
				System.out.print("please enter the length of side " + side + ": ");
				String input = in.nextLine();
				valid = false;
	
				//perform input validation
				try
				{
					validSide = Double.parseDouble(input);
					valid = true;
								
				}catch (Exception e) 
				{				    
					System.out.print("Error: Please enter a whole number.\n\n");
					
				}//end catch of exception e
				
			}while(!valid);//end deposit do	
		
		//return the valid integer
		return validSide;
		
	}//end getSideLength(side)
	


	
	

}//end lab
