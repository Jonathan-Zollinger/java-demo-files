/*
Program/Project: Lab12a
Your Name: Jonathan zollinger J Daniel Hansen
Date: 7/7/2020
Instructor: Jeff Light
Description: 
*/

package week12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab12a 
{
	public static void main(String[] args)
	{
		//initialize variables
		Scanner sIn = new Scanner(System.in);
		
		PrintWriter badwriter = null;
		PrintWriter goodwriter = null;
		
		String pwds	=	"Pwd.txt";
		String badpwds = "invalidpwd.txt";
		String goodpwds = "validpwd.txt";
		
		System.out.println("Beginning password analysis...");

		try {
			File myObj = new File(pwds);
			Scanner reader = new Scanner(myObj);
			
			System.out.printf("Opening file %s.\n",pwds);
			
			badwriter = new PrintWriter(badpwds);
			goodwriter = new PrintWriter(goodpwds);
			
			// print out the body of the .csv file
			while (reader.hasNextLine()) 
			{
				String pwd = reader.nextLine();
				

				
				if(pwd.length() < 8) 
				{
					try
					  {			
						//badwriter = new PrintWriter(badpwds);
						badwriter.printf("\n%s Password must be 8 characters in length",pwd);
						  						  
					  }catch (Exception e)
					  {	
						  e.printStackTrace();
					  }					
				}else if(!hasUpper(pwd))
				{
					try
					  {
						//badwriter = new PrintWriter(badpwds);
						badwriter.printf("\n%s Password must have atleast one upper-case letter",pwd);
						  						  
					  }catch (Exception e)
					  {	
						  e.printStackTrace();
					  }					
				}else if(!hasLower(pwd))
				{
					try
					  {
						//badwriter = new PrintWriter(badpwds);
						badwriter.printf("\n%s Password must have atleast one lower-case letter",pwd);
						  						  
					  }catch (Exception e)
					  {	
						  e.printStackTrace();
					  }					
				}else if(!hasNumber(pwd))
				{
					try
					  {
						//badwriter = new PrintWriter(badpwds);
						badwriter.printf("\n%s Password must have atleast one number",pwd);
						  						  
					  }catch (Exception e)
					  {	
						  e.printStackTrace();
					  }					
				}else if(!hasSpecial(pwd))
				{
					try
					  {
						//badwriter = new PrintWriter(badpwds);
						badwriter.printf("\n%s Password must have atleast one special character",pwd);
						  						  
					  }catch (Exception e)
					  {	
						  e.printStackTrace();
					  }
				}else
				{
					//goodwriter = new PrintWriter(goodpwds);
					goodwriter.printf("\n%s",pwd);
				}
				
			}//end while
			goodwriter.flush();
			goodwriter.close();
			
			badwriter.flush();
			badwriter.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		System.out.println("Analysis complete. Closing files.\r\n" + 
				"Results can be found in files 'invalidpwd.txt' and 'validpwd.txt' in the C:\\MyLDSBC\\CS105\\eclipse-workspace\\CD105\\ directory.");

		
	}
	
	//
	public static boolean hasUpper(String testWord) 
	{
		for(int i = 0; i < testWord.length(); i++) 
		{
			if(Character.isUpperCase(testWord.charAt(i))) 
			{
				return true;
			}//end if
		}//end for
		return false;
	}
	
	public static boolean hasLower(String testWord) 
	{
		for(int i = 0; i < testWord.length(); i++) 
		{
			if(Character.isLowerCase(testWord.charAt(i))) 
			{
				return true;
			}//end if
		}//end for
		return false;
	}
	
	public static boolean hasNumber(String testWord) 
	{
		for(int i = 0; i < testWord.length(); i++) 
		{
			if(Character.isDigit(testWord.charAt(i))) 
			{
				return true;
			}//end if
		}//end for
		return false;
	}
	
	public static boolean hasSpecial(String testWord)
	{
		char[] specials = {'@','#','%','-','&','*'};
		
		for(int i = 0; i < testWord.length(); i++)
		{
			for(int j = 0; j < specials.length; j++)
			{
				if(testWord.charAt(i) == specials[j])
					{
						return true;
					}//end if
			}//end j loop
		}//end i loop
		return false;
	}//end hasSpecial()

}
