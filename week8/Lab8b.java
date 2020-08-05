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

public class Lab8b {
	

	public static void main(String[] args) 
	{
			//define variables
		String stars				= "************************************************** \n**************************************************";
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
				
				//print the array by incrementing through each index, printing the index number and its respective value.
				for(int i = 0; i < values.size(); i++)
				{
					System.out.printf("     %d\t\t   %d%n", i, values.get(i));
				}
				
						
				//print the rest of the results
				System.out.printf("There are %d items in the ArrayList.%nThe sum total of the numbers in the ArrayList is %d.%n%n",values.size(),sumValues(values));
				if(dups(values).size() == 0)
				{
					System.out.print("there are no duplicates in the ArrayList./n");
				}else
				{
				System.out.printf("The following numbers were duplicated in the ArrayList: %s%n", printArrayList(dups(values)));
				}
			runAgain = validation.runAgain(stars + "\nDo you want to run the program again? ");
		
		}while(runAgain);
	}//end main
	
	
	
	
	
	public static int sumValues(ArrayList<Integer> inputArray)
	{
		int sum = 0;
		for(int i = 0; i < inputArray.size(); i++)
		{
			sum = sum + inputArray.get(i);
		}
		return sum;
	}//end sumValues()
	
	
	
	
	public static ArrayList<Integer> dups(ArrayList<Integer> inputArray)
	{
		ArrayList<Integer> outputArray = new ArrayList<Integer>();
		//find duplicates created in the input arrayList using the .contains() and the .subList() methods
				for(int i = 0; i < inputArray.size(); i++)
				{
					if(i != 0)
					{
						if(i == inputArray.size())
						{
							if(inputArray.subList(0,i-1).contains(inputArray.get(i)))
							{
								isAlreadyDup(outputArray,inputArray.get(i));
								continue;
							}//end last index
						}
						if(inputArray.subList(0,i-1).contains(inputArray.get(i)) && inputArray.subList(i+1,inputArray.size()).contains(inputArray.get(i)))
						{
							isAlreadyDup(outputArray,inputArray.get(i));
							continue;
						}//end mid indices
					}
					if(inputArray.subList(i+1,inputArray.size()).contains(inputArray.get(i)))
					{
						isAlreadyDup(outputArray,inputArray.get(i));
						continue;
					}//end first index
				}
		return outputArray;
		
	}//end dups()
	
	
	
	
	
	public static ArrayList<Integer> isAlreadyDup(ArrayList<Integer> inputArray, int n)
	{
		if(inputArray.contains(n))
		{
			return inputArray;
		}else 
		{
			inputArray.add(n);
			return inputArray;
		}
		
	}//end isAlreadyDup
	
	
	
	
	
	public static String printArrayList(ArrayList<Integer> inputArray)
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
	
}//end Lab8b
