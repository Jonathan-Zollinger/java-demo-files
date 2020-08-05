package week3;

/* Class: Lab-3c: Sunday Classes
 * Name: Otavio Furtado & Jonathan Zollinger
 * Date: 5/7/2020
 * Description: figures where we're going for the second hour of church based on given age and potential gender input
 * Instructors Name: Jeff Light */

//import scanner
import java.util.Scanner;

public class Lab3c {
	public static void main(String[] args) {
		//print purpose of the program
				System.out.println("This program will ask a member's age and gender and determine which class they should attend on Sunday.\n");
				
		//define scanner variable
		Scanner input = new Scanner(System.in);	
		
		//ask for user's age		
		System.out.print("Please enter the member's age: ");
		int age = Integer.parseInt(input.nextLine());
		String gender;
		
		//figure if member is less than 12
		if (age < 12) {
			
			//figure where in primary the member should go
			if (age < 1 ) {
				System.out.print("The member is a Babe in Arms.");
			}else if (age < 3) {
				System.out.print("The member should be in Nursery.");
			}else {
				System.out.print("The member should attend Primary.");
			}
		//figure where the member should go outside of primary
		}else {
			System.out.print("Please enter the member's gender: ");
			gender = input.nextLine();
			if (age < 18) {
				if (gender.equalsIgnoreCase("f")) {
					System.out.print("The member should attend Young Women's.");
				}else {
					System.out.print("The member should attend Young Men's.");
			} //end if age>18
			}else {
				if (gender.equalsIgnoreCase("f")) {
					System.out.print("The member should attend Relief Society.");
				}else {
					System.out.print("The member should attend Priesthood.");
				}//end priesthood else
			}//end age>18 else
		}//end of age < 12 else		
	}//end public static void main
}//end public class Lab3c
