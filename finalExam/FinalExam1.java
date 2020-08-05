/*
 * Program: Final Exam 1
 * Name:Jonathan Zollinger
 * Date: 7/23/2020
 * Instructor: Jeff Light
 * Description: final exam part1
 */
 package finalExam;

import java.util.Scanner;

public class FinalExam1 
{
	public static void main(String[] args) 
	{
		//define variables
		String hostQ = "Who is the host of the party? ";
		String pizzaQ = "How many pizzas were ordered? ";
		String peopleQ = "Please enter the number of people attending the party: ";
		String intNumErr = "Invalid response.  Please enter a whole number. ";
		
		Scanner sIn = new Scanner(System.in);
		
		//ask the first question
		System.out.print(hostQ);
		String partyHost = sIn.nextLine();
		
		//ask the second question
		int pizzaAnswer = getInt(pizzaQ,intNumErr);
		
		//ask the third question
		int peopleAnswer = getInt(peopleQ,intNumErr);
	
		//figure necessary math
		double pizPerPerson = (double)pizzaAnswer * 8 / (double)peopleAnswer;
		
		
		//print results
		System.out.printf("With %d people attending %s's party, %d pizzas will provide each "
				+ "attendee with %.2f slices to eat.", peopleAnswer, partyHost, pizzaAnswer, pizPerPerson);
		
	}//end of main()
	public static int getInt(String prompt, String error)
	{
		//define variables
		int validInt = 0;
		Scanner sIn = new Scanner(System.in);
		boolean done = false;
		String input = null;
		
		
		do
		{
			//ask for user input
			System.out.print(prompt);
			input = sIn.nextLine();
			
			//attempt to parse input into integer
			try
			{
				validInt = Integer.parseInt(input);
				
				//exit do-while
				done = true;
			}catch(Exception e)
			{
				System.out.println(error);
			}
			
		}while(!done);
		
		//return validated integer
		return validInt;
	}//end static int getInt()
	
	
}//end of class FinalExam1
