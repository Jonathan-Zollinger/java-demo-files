package week2;

//import libraries
import java.util.Scanner;

public class Lab2c {
	
	public static void main(String[] args) {
		
		//print purpose of the program to the terminal
		System.out.println("This program will ask the user for a monthly deposit, an annual interest rate and then calculate the balance after 6 months.\n\n");
		
		//define scanner variable
		Scanner input = new Scanner(System.in);
		
		//ask user for a monthly deposit
		System.out.print("Please enter the amount to be deposited each month: ");
		double dpst = Double.parseDouble(input.nextLine());

		//request the annual insterest rate, convert to double & convert to percentage
		System.out.print("Please enter the annual interest rate percent (ie 3% is entered \"3\"): ");
		double yRate = (Double.parseDouble(input.nextLine()))/100;
		
		//convert yearly interest rate to monthly rate
		double mRate = yRate/12;
		
		//calculate balance after month 1
		double balance = (dpst)*(1 + mRate);
				
		//calculate balance after month 2
		balance = (balance + dpst)*(1 + mRate);
		
		//calculate balance after month 3
		balance = (balance + dpst)*(1 + mRate);
		
		//calculate balance after month 4
		balance = (balance + dpst)*(1 + mRate);
		
		//calculate balance after month 5
		balance = (balance + dpst)*(1 + mRate);
		
		//calculate balance after month 6
		balance = (balance + dpst)*(1 + mRate);
		
		//print balance
		System.out.print("The ending balance after 6 months is: $" + balance);
		
		//end of program	
		
	}
}
