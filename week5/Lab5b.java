package week5;

/* Class: Lab-5b: Improved Interest Calculator
 * Name: Guilherme Silva & Jonathan Zollinger
 * Date: 5/21/2020
 * Description: we're improving on Lab4c. we're asking for the user to input a beginning balance, annual interest rate and the time the money will be saved.
 * Instructors Name: Jeff Light */

//import scanner
import java.util.Scanner;

public class Lab5b 
{

	public static void main(String[] args) 
	{
		//define variables
				
		Scanner in = new Scanner(System.in);
				
		String input 		= "";
		String playAgain 	= "";
				
		boolean gameAgain 	= false;
		boolean valid		= false;
		
		double yRate		= 0;
		double mRate		= 0;
		double balance		= 0;
		double deposit 		= 0;
		
		int mTime			= 0;



		//print program objective
		System.out.print("his program will ask the user for a monthly deposit, an annual interest rate and the number of months the user plans on saving.\n" + 
				"It will then show the monthly balance over the period of planned savings.\n\n");
		
				do
				{

					input 		= "";
					playAgain 	= "";
							
					gameAgain 	= false;
					valid		= false;
					
					yRate		= 0;
					mRate		= 0;
					balance		= 0;
					deposit 	= 0;
					
					mTime		= 0;
		
						//ask for the deposit		
						do
						{
							System.out.print("Please enter the amount to be deposited each month: ");
							input = in.nextLine();
							valid = false;
				
							//perform input validation
							try
							{
								deposit = Double.parseDouble(input);
								valid = true;
				
								
							}catch (Exception e) 
							{				    
								System.out.print("Error: Please enter a whole number.\n\n");
							}
						}while(!valid);//end deposit do
						
						//ask for annual interest rate
						do
						{
							System.out.print("Please enter the annual interest rate: ");
							input = in.nextLine();
							valid = false;
				
							//perform input validation
							try
							{
								yRate = Double.parseDouble(input)/100;
								valid = true;
				
								
							}catch (Exception e) 
							{				    
								System.out.print("Error: Please enter a whole number.\n\n");
							}
						}while(!valid);//end interest rate entry do
				
						//ask for length of savings life
						do
						{
							System.out.print("Please enter the number of months you plan to save: ");
							input = in.nextLine();
							valid = false;
				
							//perform input validation
							try
							{
								mTime = Integer.parseInt(input);
								valid = true;
				
								
							}catch (Exception e) 
							{				    
								System.out.print("Error: Please enter a whole number.\n\n");
							}//end catch
							
						}while (!valid);//end savings life entry do
						
						/*
						//test print
						//System.out.printf("%n%nyRate is %.2f, balance is $%.2f and time in months is %d",yRate, deposit, mTime);
						*/
						
						//print header
						System.out.print("\n\nMONTH\t\tBALANCE");
						
						//calculate mRate from yRate
						mRate = yRate / 12;
						
						
						for(int i = 1; i <= mTime; i ++)
						{
							//calculate the new total
							balance = (deposit + balance) * (1 + mRate); //the formula should be the formula below:
							
							//balance = (balance)*(1+mRate)+deposit;
							
							//print results
							System.out.printf("%nMonth %d:\t$%,.2f",i,balance);
									
						}//end monthly calculation and printout for loop
						
						//ask if they'd like to play again
						do 
						{									
								System.out.print("\n\n\nWould you like to play again? ");   
						    	playAgain = in.nextLine();
						    	valid = false;
								
								//validate the user put in "Y" or "N"
						
								if(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) 
								{
									valid = true;
									if(playAgain.equalsIgnoreCase("Y")) 
									{
										gameAgain = true;	
										System.out.print("\n\n");
									}else 	
									{
										System.out.print("\nThanks for playing!");																	
									}//end Y/N else
								}else 	
								{
									System.out.println("Error: Please answer with a 'Y' or 'N'.\n");										
								}//end Y-N validation else
								
						}while(!valid);//end play again question

				}while(gameAgain);//end play again do-while
		
		}//end main
	
}//end Lab 5b
