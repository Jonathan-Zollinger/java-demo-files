package week2;

/*
 	this program will request user kybd for the width of a square, and the dimensions of a rectangle. it will then take those values
	and provide the area of the square and rectangle after reiterating the values if received.
*/

import java.util.Scanner;

public class Lab2b {
	public static void main(String[] args) {
		//using Scanner to get kybd from the user.
		Scanner kybd = new Scanner(System.in);
		
		//Request square dimension & convert to integer (why dont we just request this as an integer instead?
		System.out.println("please enter the width of the square as a whole number: ");
		int sqWidth = Integer.parseInt(kybd.nextLine());
		
		//request rectangle dimensions & convert to integer
		System.out.println("please enter the width of the rectangle as a whole number: ");
		int recWidth = Integer.parseInt(kybd.nextLine());		
		System.out.println("please enter the height of the rectangle as a whole number: ");
		int recHeight = Integer.parseInt(kybd.nextLine());
		
		//do the math
		int sqArea = sqWidth * sqWidth;
		int recArea = recWidth * recHeight;
		
		//print results
		System.out.println("The area of a square with a width of " + sqWidth + " is " + sqArea + ".");
		System.out.println("The area of a rectangle with a width of " + recWidth + " and a height of " + recHeight + " is " + recArea + "."); 
		
		//end of program
	}
}