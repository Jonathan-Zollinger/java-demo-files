package week8;

/* Class: Lab-8a: Passing an ArrayList to sumValues()
 * Name: Jonathan Zollinger (Lincoln was my partner but we're not able to find time to work together)
 * Date: 6/11/2020
 * Description: This program will ask the user to enter a series of numbers.
					The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.
					The program will then display the array of numbers and the sum total of those numbers.
 * Instructors Name: Jeff Light */


import java.util.ArrayList;
import java.util.Scanner;
import zollinger.validation;

public class Lab8a {
	

	public static void main(String[] args) 
	{
			//define variables
		String stars				= "**************************************************";
		String objective 			= 
				"This program will ask the user to enter a series of numbers.\n" + 
				"The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\n" + 
				"The program will then display the array of numbers and the sum total of those numbers.";
		
		String input	 			= "";

    	boolean done				= false;
		boolean runAgain			= false; 
		
		Scanner in 					= new Scanner(System.in);
		
		ArrayList<Integer> values	= new ArrayList<Integer>();
		
		
		//print program objective
		System.out.println(objective);
		
		do
		{
			//empty the values arraylist in the case this is looped back
			values.clear();
			
			//reset variables
	    	done				= false;
			runAgain			= false;
		
		//accept user input integers to an undefined size array. finish the arraylist when the user inputs a blank input
		do 
		{
			try 
			{
				int newNum = validation.addArrayInt("Please enter a number (or just hit enter to finish) : ");
				values.add(newNum);
			}
			catch (Exception e) //if provided null value, break from do while loop
			{
				done = true;
			}
		}while(!done);
		
		//print results
			//print header
		System.out.print("\nArray Index      Item\n");	
		
		//find the sum of all the values provided in the arraylist and print the incrementing index and respective value
		for(int i = 0; i < values.size(); i++)
		{
			System.out.printf("     %d\t\t   %d%n", i, values.get(i));
		}
		
		//print the rest of the results
		System.out.printf("There are %d items in the ArrayList.%nThe sum total of the numbers in the ArrayList is %d.%n%n",values.size(),sumValues(values));
		
		runAgain = validation.runAgain(stars + "\nDo you want to run the program again? ");
		
		}while(runAgain);
	}
	public static int sumValues(ArrayList<Integer> inputArray)
	{
		int sum = 0;
		for(int i = 0; i < inputArray.size(); i++)
		{
			sum = sum + inputArray.get(i);
		}
		return sum;
	}
	
}
