package week4;

/* Class: Lab-4d: Guessing Game
 * Name: Otavio Furtado & Jonathan Zollinger
 * Date: 5/14/2020
 * Description: this program performs text validation on user input Y or N from given question
 * Instructors Name: Jeff Light */

//import ... stuff


import java.util.Scanner;
import java.lang.Math;

public class Lab4d {
		public static void main(String[] args) {
		
			//define variables
			Scanner in = new Scanner(System.in);
			boolean valid = false;
			boolean valid2 = false;
			boolean gameAgain = false;
			boolean goodGuess = false;
			int randNum = 0;
			int guess = 0;
			int guessCount = 1;
			String input = "";
			String playAgain = "";
			

			//state the objective of this program
			System.out.print("This program is a guessing game.\n" + 
			"The computer will generate a random integer between 1 and 100. The user will try to guess the number.\n" + 
			"Let's get started!" + 
			"\n\n" + 
			"I'm thinking of a number between 1 and 100.\n");		
			
		
			do {
		 			randNum = (int)(Math.random()*100) + 1 ;
		 			valid = false;
		 			valid2 = false;
		 			gameAgain = false;
		 			goodGuess = false;
		 			guess = 0;
		 			guessCount = 1;
		 			input ="";
		 			playAgain = "";

		 			
		 			if( guessCount > 1) {
		 				System.out.print("\n");
		 			}else {}
		 											    
				do {
					
					//ask the user for their guess & validate that it is an integer.
							do {
									System.out.print("What is your guess? ");				
				
								    input = in.nextLine();
									
									//perform data validation
								    try {
								    	guess = Integer.parseInt(input);
								    	valid = true;
								    	
								    }catch (Exception e) {				    
										System.out.print("Error: Please enter a whole number.\n\n");
									}//end catch
								    
							}while (!valid);
					
					if(guess == randNum) {
								    	
	    						//Print victory message
						    	System.out.print("\nCORRECT! You guessed it in " + guessCount + " tries! ");										    
						 											    			
								do {									
									
									//ask if they want to play again
									System.out.print("Would you like to play again? ");   
								    	playAgain = in.nextLine();
										goodGuess = true;
										
										//validate the user put in "Y" or "N"
									
									
									if(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) {
											valid2 = true;
												if(playAgain.equalsIgnoreCase("Y")) {
													gameAgain = true;									
													
												}else 	{
													System.out.print("\nThanks for playing!");																	
														}//end Y/N else
										}else 	{
										System.out.println("Error: Please answer with a 'Y' or 'N'.\n");										
												}//end Y-N validation else
										
								}while (!valid2);
					    }else if(guess < randNum) {
							System.out.println("\nYour guess is too low. Try again.");
							guessCount ++;
							
						}else {
							System.out.println("\nYour guess is too high. Try again.");
							guessCount ++;
							
						}//end guess = randNum if
				}while (!goodGuess);
			}while(gameAgain);
			
	}
}//end lab4d
