package week7;

/* Class: Lab-7a: checkEligibility()
 * Name: Guilherme Silva & Jonathan Zollinger
 * Date: 6/2/2020
 * Description: This program will ask the user to enter a name and a birth year for a potential student.
 * 					The program will then determine what type of school, if any, the potential student is eligible to attend.
 * Instructors Name: Jeff Light */


import java.util.Scanner;					//import scanner
import java.time.LocalDate; 				// Import the LocalDate class
import java.time.LocalTime;					// Import the LocalTime class
import java.util.Scanner; 					// Needed for user input
import java.time.format.DateTimeFormatter;	// Import the DateTimeFormatter class


public class Lab7a 
{
	public static void main(String[] args) 
	{		
		//define variables
				boolean gameAgain 	= false;
				
				String input		= "";
				String objective 	= "This program will ask the user to enter a name and a birth year for a potential student.\n" + 
										"The program will then determine what type of school, if any, the potential student is eligible to attend.";
				
				Scanner in 			= new Scanner(System.in);
								
		//print program objective
		System.out.print(objective);
		
		//ask the user for their name and birth year (and validate their integer)
		do
		{
			gameAgain = false;
			
			System.out.print("\nPlease enter the name of a potential student: ");
			String sName = in.nextLine();
			
			int sYear = validInt("Please enter the year the potential student was born: ");
			
			System.out.print(sName + checkEligibility(sName,sYear) + "\n");
			gameAgain = runAgain("\n\nDo you want to run the program again? ");
			
			
		}while(gameAgain);
		
	}

	public static String checkEligibility(String sName, int sYear)
	{
		int age = calculateAge(sYear);
		String eligibility = "";
		
		if(age <= 4)		
		{
			eligibility = " is "+ age +" and is too young to attend school";
		}else if(age <= 11)
		{
			eligibility = " is "+ age +" should attend Elementary School";
		}else if(age <=14)
		{
			eligibility = " is "+ age +" should attend Jr. High School";
		}else if(age <=17)
		{
			eligibility = " is "+ age +" should attend High School";
		}else
		{
			eligibility = " is "+ age +" should attend College";
		}		
		return eligibility;
		
	}//end checkEligibility method
	
	public static int calculateAge(int sYear)
	{
		LocalDate todayYearDateObject = LocalDate.now();
		
		DateTimeFormatter yearFormat = DateTimeFormatter.ofPattern("yyyy");
		int todayYear = Integer.parseInt(todayYearDateObject.format(yearFormat));
		
		return todayYear - sYear;
		
	}//end calculateAge method
	
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
