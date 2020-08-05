package week2;

import java.util.Scanner;

public class Lab2a {
	
	public static void main(String[] args) {
		//using Scanner to get input from the user.
		Scanner kybd = new Scanner(System.in);
		
		//ask user to give their name
		System.out.print("Please enter your name! \n");
		String name = kybd.nextLine();
		
		//ask the user for their favorite dessert
		System.out.print("Hi " + name + "! what's your favorite dessert?\n");
		String dessert = kybd.nextLine();
		
		//print results
		System.out.print("Hello " + name + "!\n");
		System.out.println("I hope you like coding JavaScript as much as you like to eat " + dessert + "!");
		
		//ask additional question #1
		System.out.println("\n\naaaaanywaaaays, how many toes you got?");
		int toes = kybd.nextInt();
		
		//figure and print the appropriate response to
		if	(toes < 10) {
			System.out.println("dude, that's, like " + (10 - toes) + " fewer toes than you should have...");
		}	else if (toes > 10) {
			System.out.println("dude, that's, like " + (toes - 10) + " more toes than you should have...");
		} 	else {
			System.out.println("dude, I have " + toes + " toes too!\n");
		}	
		
		//ask additional question #2
		System.out.println("\nNext question! How hot is it outside (in fahrenheit)? ");
		double temp = kybd.nextDouble();
		String placeholder = kybd.nextLine();
				
		//print result and convert to celsius
		System.out.println("cool cool. fyi, that's " + (temp - 32) + " degrees above freezing");
		
		//ask question #3
		System.out.println("\nthere's nothing like a good foot stomping of \"ballad of billy the kid\" to get my tear ducts flowing. what's your favorite song to cry to? ");
		String song = kybd.nextLine();
		//print response
		System.out.println("I'll have to give " + song + " a try next time I need that. thanks!");
		
		//ask question #4
		System.out.println("\nSo... what instruments, if any, do you play?");
		String inst = kybd.nextLine();
		
		//print response
		System.out.println("That's cool! I wish I could play the" + inst + " too!");
		
		//ask question #5
		System.out.println("\nWhat's your favorite sports team?");
		String team = kybd.nextLine();
		
		//print response
		System.out.println("ya, " + team + " are great!");
		
		
		
		/*
		System.out.println("\nWhat color do you wear during the Holy War?");
		String color = kybd.nextLine();		
		
		
		we couldn't get this to work, we dunno why
		if  (color == "red") {
			System.out.println("nice! I like to wear red too!");
		}
		else {
			System.out.println("darn! I like to wear red instead of " + color + "!");
		}
		*/
	}
	}


