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
import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab10b 
{
	public static void main(String[] args) 
	{
		String fileName = "Student Assignment Scores.csv";
		
		try
		{
			File myObj = new File(fileName);
			Scanner reader = new Scanner(myObj);
			
			//print out the header
			String header[] = reader.nextLine().split(",");
			String lines = "--------------------------------------------------------------------------------------------";
			
			System.out.printf("%-30s",header[0]);
			for(int i = 1; i < header.length; i ++)
			{
				
				System.out.printf("%10s",header[i]);
			}
			System.out.printf("%n%s%n",lines);
			
			//print out the body of the .csv file
			while (reader.hasNextLine())
			{
				String output[] = reader.nextLine().split(",");
				System.out.printf("%-30s",output[0]);
				for(int i = 1; i < output.length; i ++)
				{
					
					System.out.printf("%10s",output[i]);
				}
				System.out.println();
			}
			
		}catch (FileNotFoundException e)
		{
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
		
	}

}
