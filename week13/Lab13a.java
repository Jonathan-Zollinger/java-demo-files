/*
Program/Project: Lab13a
Your Name: Jonathan zollinger J Daniel Hansen
Date: 7/14/2020
Instructor: Jeff Light
Description: write an automated letter to students iterating which assignments are missing, using two input files and writing as many letters as needed.
*/
package week13;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab13a
	{
		public static void main(String[] args) 
		{
			String gradesFile = "Student Assignment Scores.csv";
			String letterFile = "Warning Letter to Student -.txt";
			PrintWriter writer = null;
			
			try
			{
				File grdFileObj = new File(gradesFile);
				Scanner readerGrades = new Scanner(grdFileObj);
				
				File wrngFileObj = new File(letterFile);
				Scanner readerWarning = new Scanner(wrngFileObj);
				
				//define warning letter
				Scanner letter = readerWarning.useDelimiter("\\Z");
				String warningLetter = letter.next();
				
				//print status to console
				System.out.println("Successfully read template file into program.");
				
								
				//read in the grades file
				

				while (readerGrades.hasNextLine())
				{
					boolean first = false;
					String output[] = readerGrades.nextLine().split(",");
					for(int i = 1; i < output.length; i ++)
					{
						
						if(output[i].equalsIgnoreCase("0") && !first)
						{
							first = true;
							writer = new PrintWriter("Warning Letter to Student " + output[0] +".txt");
							writer.printf("%s\n\n%s\n\nAssignment %d\n",output[0],warningLetter,i);
							writer.flush();
							System.out.printf("wrote letter for %s's parents%n",output[0]);

							
						}else if(output[i].equalsIgnoreCase("0") && first)
						{
							
							writer.printf("Assignment %d%n",i);
							writer.flush();

						}
					}
				}	
			}catch (FileNotFoundException e)
			{
				System.out.println("An error occurred.");
			    e.printStackTrace();
			}//end catch
			
			System.out.print("\n\nProgram is finished processing\n\n");
		}//end main

		
		
	}//end Lab13a