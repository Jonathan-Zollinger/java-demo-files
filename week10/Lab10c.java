/*
Program/Project: Lab11a
Your Name: Jonathan Zollinger
Date: 6/30/2020
Instructor: Jeff Light
Description: This program uses reader to read in data from a csv file located in the system folder.
*/

package week10;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10c 
{
	public static void main(String[] args) 
	{
		String fileName = "Student Assignment Scores.csv";
		
		try
		{
			File myObj = new File(fileName);
			Scanner reader = new Scanner(myObj);
			
			//print out the header
			String header1 = "Student";
			String header2 = "Assignment with 0";
			String lines = "--------------------------------------------";
			
			System.out.printf("%-22s%s%n%s%n",header1,header2,lines);
			
			reader.nextLine();
			
			//print out the body of the .csv file
			while (reader.hasNextLine())
			{
				String output[] = reader.nextLine().split(",");
				for(int i = 1; i < output.length; i ++)
				{
					if(Integer.parseInt(output[i]) == 0)
						{
							System.out.printf("%-30s%s%n",output[0],i);
						}
				}

			}
			
		}catch (FileNotFoundException e)
		{
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
		
	}

}
