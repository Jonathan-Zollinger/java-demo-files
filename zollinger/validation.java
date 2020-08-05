package zollinger;

import java.util.ArrayList;
import java.util.Scanner;

public class validation {
	
	/*
	this method asks for and provides a valid 'Y' or 'N' input. it loops through data validation until the user
	enters proper input. this method requires the java.util.Scanner to be imported already 
	*/
	public static boolean runAgain(String prompt)
	{
		
		String playAgain 	= "";
		
    	boolean valid 		= false;
    	boolean runAgain 	= false;
    	
    	Scanner in 			= new Scanner(System.in);
    	
    	do //provide Yes - No input prompt
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
		runAgain = false;//already set to false, but just to reiterate that this is false.
	}//end Y/N else
	
		
		return runAgain;
	}//end runAgain
	
	
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
	this method asks for and provides a valid integer and allows for a blank input. it loops through data validation until the user
	enters proper input. this method requires the java.util.Scanner to be imported already 
	*/
	@SuppressWarnings("null")
	public static int addArrayInt(String prompt)	
	{								
		int validInt = 0;
		boolean valid = false;
		do
			{
				Scanner in = new Scanner(System.in);
				
				System.out.print(prompt);
				String input = in.nextLine();
				valid = false;
				
				//find if input is blank
				if(input.length() == 0)
				{
					validInt = (Integer) null;
				}else
				{	
					//perform input validation
					try
					{
						validInt = Integer.parseInt(input);
						valid = true;
									
					}catch (Exception e) 
					{				    
						System.out.print("Error: Please enter a whole number.\n\n");
						
					}//end catch of exception e
				}//end input.length() else()
						
			}while(!valid);//end deposit do	
				
		//return the valid integer
		return validInt;

		
	}//end validInt()

	public static String printIntegerArrayList(ArrayList<Integer> inputArray)
	{
		String printString = "";
		for(int i = 0; i < inputArray.size(); i++)
		{
			if(printString.length() == 0)
			{
				printString = printString + inputArray.get(i);
			}else
			{
				printString = printString + ", " + inputArray.get(i);
			}
		}
		return "[" + printString + "]";	
	}
}
