/*
Program/Project: Lab11a
Your Name: Jonathan zollinger J Daniel Hansen
Date: 6/30/2020
Instructor: Jeff Light
Description: Use PrintWriter to save data to a fixed storage device. Use try/catch to handle PrintWriter errors without crashing
*/
package week11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab11b
{
	/** main() method displays a menu to the user and asks them to select a command.
	 * The method will continue to display the menu to the user until they wish to quit by selecting 'Exit' from the menu.
	 * The method also creates a new, empty shoppingList of type ArrayList<String>
	 * Based on the user input, the appropriate method will be called to perform actions on the shoppingList.
	 * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
	 */
	public static void main(String[] args) {
	    //Initialize variables
	    Scanner sIn = new Scanner(System.in);						//Input Scanner for String
	    ArrayList<String> shoppingList = new ArrayList<String>();	//ArrayList for shoppingList
	    String choice;												//Holds user input of type String
	    boolean done = false;										//Keeps program running until user wants to quit
	
	    // Keep running the program until the user quits
	    do{
	    	//Print out the menu to the console
	        System.out.println();
	        System.out.println("1. Add Items");
	        System.out.println("2. Delete Items");
	        System.out.println("3. Show Items");
	        System.out.println("4. Sort Items");
	        System.out.println("5. Save List");
	        System.out.println("6. Open List");
	        System.out.println("7. Exit");
	        System.out.print("Please enter a command: ");
	        choice = sIn.nextLine(); 
	        		
	        //Call the appropriate method for the choice selected.
	        switch (choice) { 
	            case "1":	//Add items to the Shopping List
	                System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
	                break;
	            case "2":	//Delete items from the Shopping List
	            	System.out.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
	                break;
	            case "3":	//Show the items in the Shopping List
	                showItems(shoppingList);
	                break;
	            case "4":	//Sort the items in the Shopping List
	                sortItems(shoppingList);
	                break;
	            case "5":	//Save list	
	            	saveList(shoppingList);
	                break;
	            case "6": 	//Exit the program 
	            	openList(shoppingList);
	            	 break;
	            case "7": 	//Exit the program 
	            	System.out.println("\nGoodbye");
	                done = true;
	                break;
	            default:	//Handles all input that is not between 1-5
	            	System.out.println("Invalid response.  Please enter a choice from the menu (1-7).");
	        } //End of switch (choice) 
	    }while(!done);  //Keep running the program until the user quits
	}//end of main()



		//////////////////////////////////////////////
        // STUDENTS, FILL IN THE METHOD STUBS BELOW://
		//  addItems()								//
		//	deleteItems()							//
		//	showItems()								//
		//	sortItems()								//
        //////////////////////////////////////////////
	
	/** addItems() method asks the user to enter an item to be stored in the shoppingList and then adds the item to the shoppingList ArrayList.
	 * The user may enter as many items as they want, hitting ENTER to stop entering items and return to main().
	 * Each time the user enters an item into the list, a message will be displayed showing the item entered.
	 * Returns the number of items added to the shoppingList
	 */
	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) 
	{
		int startSize = shoppingList.size();
		boolean done = false;
		do 
		{
			
				System.out.print("Please enter an item to your shopping list (or just hit 'ENTER' when done): ");
				String newItem = sIn.nextLine();
				if(newItem.length() == 0)
				{
					done = true;
				}else if(isFormatted(newItem))
				{
					newItem = formatBlanksOut(newItem);
					shoppingList.add(newItem);
					System.out.printf("'%s' is added to the shopping list%n",newItem);
				}else
				{
					System.out.println("invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'");
				}
		}while(!done); 
		
		return  shoppingList.size() - startSize;
		
	}//end of method addItems(ArrayList<String>)

	
	/** deleteItems() method asks the user to enter an item to be deleted from the shoppingList and then deletes the item from the shoppingList ArrayList.
	 * The user may delete as many items as they want, hitting ENTER to stop deleting items and return to main().
	 * Each time the user deletes an item from the list, a message will be displayed showing the item deleted.
	 * If the user tries to delete an item not in the list, a message will be displayed indicating the error and showItems() will be called.
	 * Returns the number of items deleted from the shoppingList
	 */	
	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) 
	{
		int startSize = shoppingList.size();
		boolean done = false;
		do
		{
				System.out.print("Enter the item to delete from the list (or just hit 'ENTER' when done): ");
				String itemToDelete = sIn.nextLine();
				if(itemToDelete.length() == 0)
				{
					done = true;
				}
				else if(shoppingList.contains(itemToDelete))
				{
					shoppingList.remove(itemToDelete);
				}else
				{
					System.out.printf("Invalid response! '%s' is NOT an item in the list.%n",itemToDelete);
				}
			
		}while(!done);
		return  startSize - shoppingList.size();

	}//end of method deleteItems(ArrayList<String>)
	
	
	/** showItems() method simply displays the contents of the shoppingList ArrayList in it's simplest form:
	 * [item-1, item-2, item-n]
	 */	
	public static void showItems(ArrayList<String> shoppingList) 
	{
		String lines = "-----------------------\n";
		//print header
		System.out.printf("%s     Shopping List%n%s",lines,lines);
		for(int i = 0; i < shoppingList.size(); i++)
		{
			String text = shoppingList.get(i);
			String itemName = text.substring(0,text.indexOf(":"));
			String itemAmount = text.substring(text.indexOf(":")+1);
			System.out.printf("    %s\t %s%n",itemName,itemAmount);
		}
		System.out.println(lines);
	}//end of method showItems(ArrayList<String>)
	
	
	/** sortItems() method sorts the items in the shoppingList ArrayList, then calls showItems() to display the sorted list.
	 */	
	public static void sortItems(ArrayList<String> shoppingList) 
	{
		Collections.sort(shoppingList);
		System.out.println("The Shopping List has been sorted");
		showItems(shoppingList);
	}//end of method sortItems(ArrayList<String>)

	//method that performs entry validation. required the user to input items in a "<item>:<amount>" format.
	public static boolean isFormatted(String input)
	{
		if(input.indexOf(":") == -1)
		{
			return false;
		}else
		{
			return true;
		}
		
	}
	
	//method to trim formatted input strings
	public static String formatBlanksOut(String input)
	{
		String part1 = input.substring(0,input.indexOf(":"));
		String part2 = input.substring(input.indexOf(":")+1);
		return part1.trim() + ":" + part2.trim();
	}
	
	  private static void saveList(ArrayList<String> shoppingList) 
	  {
		  Scanner sIn = new Scanner(System.in);
		  PrintWriter writer = null;		  
		  boolean done = false;
		  String save = null;
		  System.out.println("Are you sure you wish to overwrite the 'Shopping List.txt' file with your current list? (Y/N)");

		  do 
		  {		
			  save = sIn.nextLine();
			  if(save.equalsIgnoreCase("Y")) 
				{
				  try
				  {				   
					  writer = new PrintWriter("shoppingList.txt");
					  writer.print(shoppingList);
					  writer.flush();
					  writer.close();
					  System.out.println("Shopping List saved to file: Shopping List.txt");
					  done = true;
				  }catch (Exception e)
				  {	
					  e.printStackTrace();
				  }
					
				}else if(save.equalsIgnoreCase("N"))
				{
					System.out.print("\nShopping List not saved.");	
					done = true;
				}else
				{
					System.out.print("Error: Please answer with a 'Y' or 'N'.\n");
				}
		  }while(!done);
	  }
	  
	  private static void openList(ArrayList<String> shoppinglist) {
		  Scanner sIn = new Scanner(System.in);
		  File inFile = new File ("shoppingList.txt");
			Scanner file = null;
			String rowInFile = "";
			String items;
			
		  boolean yesNo = true;
		  boolean done = false;
		  String save = null;
		  System.out.println("Are you sure you wish to overwrite your current list with'Shopping List.txt'? (Y/N)");

		  do 
		  {		
			  save = sIn.nextLine();
			  if(save.equalsIgnoreCase("Y")) 
				{
				  done = true;
				  shoppinglist.clear();
					try 
					{
						
						file = new Scanner(inFile);
						while(file.hasNext()) 
						{
							rowInFile = file.nextLine();
							items = rowInFile.substring(1,(rowInFile.length()-1));
							shoppinglist.add(items);
						}//end of while
					} catch (Exception e) 
					{
					System.out.printf("File Error: File 'Shopping List.txt' not found! Please save the list before trying to open it.");
					//e.printStackTrace();
					return;
					}//end of try catch
					
							

				}else if(save.equalsIgnoreCase("n"))
				{
					System.out.print("\nShopping List not loaded.");	
					done = true;
					yesNo = false;
				}else
				{
					System.out.print("Error: Please answer with a 'Y' or 'N'.\n");
				}
		  }while(!done);
		  
		  
		 if(yesNo)
		 {
			try 
			{
				file = new Scanner(inFile);
			} catch (FileNotFoundException e) 
			{
			System.out.println("File Error: File 'Shopping List.txt' not found! Please save the list before trying to open it.");
			}//end of try catch
			
			shoppinglist.clear();
			while(file.hasNext()) {
				rowInFile = file.nextLine();
				items = rowInFile.substring(1,(rowInFile.length()-1));
				shoppinglist.add(items);
				}//end of while
			System.out.print("shoppingList.txt loaded!");
		 }else
		 {
			// do nothing
		 }
		 
			}//end of try/catch
			
	  

}// end of class Lab9aStartCode
