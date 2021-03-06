package com.Board.Console;
import java.util.ArrayList;
import java.util.Scanner;

import com.Board.Map.Continent;
import com.Board.Map.Country;
import com.Board.Board;

public class Console {
	Scanner input = new Scanner(System.in);
	
	public Console() {
		
	}
	
	/**
	 * Prompts the user to enter the number of Human Players in the game.
	 * Returns the number of players corresponding to the user input.
	 * @return the number of players in the game as entered by the user.
	 */
	public int getScannerNumOfPlayers() {
		int numPlayers = 0;
		
		System.out.println("Risk" + "\n");
		System.out.print("You can have a maximum of 4 Players." 
				+ "\n" + "Please enter the number of Human Players: ");
		numPlayers = getScannerIntWithinRange(1,4);
		
		//TEST CODE
		//getScannerCommand(commands);
		//getScannerIntWithinRange(1,5, "Enter the amount of troops you would like to move.");
		//END TEST CODE
		
		return numPlayers;
	}
	
	/**
	 * Gets the player names from the scanner.
	 * @param numPlayers The number of Human Players in the game.
	 * @return an ArrayList<String> containing the player names.
	 */
	public ArrayList<String> getPlayerNames(int numPlayers) {
		ArrayList<String> pNames = new ArrayList<String>();
		
		for (int i = 1; i <= numPlayers; i++) {
			System.out.println();
			System.out.println("Player " + i);
			System.out.print("Please enter your name: ");
			pNames.add(input.nextLine());
		}
		 
		return pNames;
	}
	
	//TO BE IMPLEMENTED
	public void printStats(){}
	
	
	/**  
	* Prompts for the user to input an int between a minimum value(inclusive) and a maximum value(inclusive). 
	* Once a valid int is entered, the method returns the int.
	* Keeps running until there is a valid Input. 
	* @param min The minimum value.
	* @param max The maximum value.
	* @return An int between the min value and max value.
	*/	
	public int getScannerIntWithinRange(int min, int max) {
		boolean validInput = false;
		boolean done = false;
		int nextInt = 0;

		while (!done) {
			while (!validInput) {
				validInput = true;
				try {
					nextInt = Integer.parseInt(input.nextLine());	
					if (nextInt >= min && nextInt <= max ) {
						done = true;
					} else {
						throw new Exception();
					}
				} catch(Exception e) {
					System.out.println("You have entered an invalid input!");
					System.out.println("Your number should be between "+ min + " and " + max + ".");
					System.out.print("Please enter a number: ");
					validInput = false;
				}
			}						
		}
		
		return nextInt;		
	}

	
	
	/**  
	* Prompts for the user to input an int between a minimum value(inclusive) and a maximum value(inclusive). 
	* Once a valid int is entered, the method returns the int.
	* Keeps running until there is a valid Input. 
	* @param min The minimum value.
	* @param max The maximum value.
	* @param A prompt for the user.
	* @return An int between the min value and max value.
	*/	
	public int getScannerIntWithinRange(int min, int max, String prompt) {
		boolean validInput = false;
		boolean done = false;
		int nextInt = 0;
		
		System.out.println(prompt);
		System.out.print("Please enter a number between "+ min + " and " + max + ":");
		
		while (!done) {
			while (!validInput) {
				validInput = true;
				try {
					nextInt = Integer.parseInt(input.nextLine());	
					if (nextInt >= min && nextInt <= max ) {
						done = true;
					} else {
						throw new Exception();
					}
				} catch(Exception e) {
					System.out.println("You have entered an invalid input!");
					System.out.println(prompt);
					System.out.println("Your number should be between "+ min + " and " + max + ".");
					System.out.print("Please enter a number:");
					validInput = false;
				}
			}						
		}
		
		return nextInt;		
	}
	
	
	
	/**
	 * Prompts for the user to input a command. Once a valid command is entered, the command is returned as a String.
	 * @param cmds A list of Strings containing valid commands.
	 * @return A String of the command entered by the user.
	 */
	public String getScannerCommand(ArrayList<String> cmds) {
		boolean validInput = false;
		boolean done = false;
		String nextString = "";
		
		System.out.print("Commands:");
		for (String s : cmds) {
			System.out.print(" [" + s + "]");
		}
		System.out.print("\nPlease enter a command: ");
		
		while (!done) {
			while (!validInput) {
				validInput = true;
				try {
					nextString = input.nextLine();
					
					for (String str : cmds) {
						if (nextString.equalsIgnoreCase(str)) {
							done = true;
						}
					}
					if (!done) throw new Exception();
				} catch(Exception e) {
					System.out.println("You have entered an invalid command!");
					System.out.print("Commands:");
					for (String s : cmds) {
						System.out.print(" [" + s + "]");
					}
					System.out.print("\nPlease enter a command: ");
					validInput = false;
				}
			}
			
		}
		
		return nextString;		
	}
	
	
	/**
	 * Prints a String and then terminate the line using System's println method.
	 * @param s The String to be printed.
	 */
	public void println(String s) {
		System.out.println(s);
	}
	
	
	/**
	 * Prints a String using System's print method.
	 * @param s The String to be printed.
	 */
	public void print(String s) {
		System.out.print(s);
	}
	
	
	/**
	 * Prompts for the user to input a command. Once a valid command is entered, the command is returned as a String.
	 * @param cmds A list of Strings containing valid commands.
	 * @return A String of the command entered by the user.
	 */
	public String getScannerCountry(ArrayList<Country> validCountries) {
		boolean validInput = false;
		boolean done = false;
		String nextString = "";
		int count = 0;
		System.out.print("Countries:");
		for (Country c : validCountries) {
			System.out.print(" [" + c.getName() + "]");
			count ++;
			if (count == 5) {
				System.out.println();
				System.out.print("          ");
			}
		}
		count = 0;
		System.out.print("\nPlease enter a Country: ");
		
		while (!done) {
			while (!validInput) {
				validInput = true;
				try {
					nextString = input.nextLine();	
					for (Country c : validCountries) {
						if (nextString.equalsIgnoreCase(c.getName())) {
							done = true;
						}
					}
					if (!done) throw new Exception();
				} catch(Exception e) {
					System.out.println("You have entered an invalid Country!");
					System.out.print("Countries:");
					for (Country c : validCountries) {
						System.out.print(" [" + c.getName() + "]");
						count ++;
						if (count == 5) {
							System.out.println();
							System.out.print("          ");
						}
					}
					count = 0;
					System.out.print("\nPlease enter a Country: ");
					validInput = false;
				}
			}
			
		}
		
		return nextString;		
	}
	
	public void printCountryArrayList(ArrayList<Country> cList) {
		for (Country c : cList) {
			System.out.print(" [" + c.getName() + "] ");
		}
		System.out.println();
	}
	
	public void printBoardState(ArrayList<Continent> continents, int i, Board b) {
		System.out.println(continents.get(i).getContinentName());
		for(int j = 0; j < continents.get(i).getCountries().size(); j++) {
			System.out.println("	" + continents.get(i).getCountries().get(j).getName() + "---(" 
			+ b.getPlayerName(continents.get(i).getCountries().get(j).getPlayerOwnerOfCountry()) + ")---" + continents.get(i).getCountries().get(j).getNumTroops() + " troops.");
		}
	}
	
}
