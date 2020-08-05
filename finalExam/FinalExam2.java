/*
 * Program: Final Exam 2
 * Name: Jonathan Zollinger
 * Date: 4/9/2020
 * Instructor: Jeff Light
 * Description: final exam part 2
 */
package finalExam;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalExam2 
{

	public static void main(String[] args) 
	{
		//define variables
		String programDescription = "In this program, you will ask the user to enter a list of book titles.\n"
									+ "The program will then find the longest book title and the total number of letters in all of the book titles.";
		String question = "Please enter the title of a book (or just hit enter to finish): ";
		String input = "";
		
		ArrayList<String> books = new ArrayList<String>();
		
		Scanner sIn = new Scanner(System.in);
		
		boolean done = false;
		
		//print Program Description
		System.out.println(programDescription);
		
		//start do-while loop allowing the user to enter as many book titles as they want. 
		do
		{
			//ask user for the title of their book
			System.out.print(question);
			input = sIn.nextLine();
			if(input.length() == 0)
			{
				done = true;
			}else
			{
				books.add(input);
			}
		}while(!done);
			
		//print results
		System.out.printf("The longest title in the list of books is: %s.\n", longestTitle(books));
		System.out.printf("The total number of letters in all book titles is:%d",totalLetters(books));
		
		
				
	}//end of main()

	public static String longestTitle(ArrayList<String> inputArray)
	{
		//define variables
		String longTitle = "";
		int titleRecord = 0;
		
		//loop through the books and find the longest title, then have longTitle adopt that name.
		for(int i=0;i < inputArray.size(); i++)
		{
			if(inputArray.get(i).length() > titleRecord)
			{
				longTitle = inputArray.get(i);
			}//end if statement
		}//end for loop
		
		//return longest title
		return longTitle;
	}//end longestTitle
	
	public static int totalLetters(ArrayList<String> inputArray)
	{
		//define variables
		int totalLetters = 0;
		
		//loop through the books, taking each title's text length and adding it to a running total.
		for(int i=0;i < inputArray.size(); i++)
		{
			totalLetters = totalLetters + inputArray.get(i).length();
		}		
		
		//return total letters value
		return totalLetters;
	}//end longestTitle
	
}//end of class FinalExam2
