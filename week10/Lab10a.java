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

public class Lab10a 
{
	public static void main(String[] args) 
	{
		String fileName = "Student Assignment Scores.csv";
		try
		{
			File myObj = new File(fileName);
			Scanner reader = new Scanner(myObj);
			while (reader.hasNextLine())
			{
				String data = reader.nextLine();
				System.out.println(data);
			}
			
		}catch (FileNotFoundException e)
		{
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
		
	}

}
