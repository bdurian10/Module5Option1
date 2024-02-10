package module5Option1;

import java.util.ArrayList;
import java.util.Scanner;

public class Temps {
	
	public static void main(String[] args) {
		
		//Declare Variables
		ArrayList<Double> dailyTemp = new ArrayList<Double>(); //ArrayList for daily average temperatures
		ArrayList<String> days = new ArrayList<String>(); //ArrayList for Days of the Week
		float weeklyAvg = 0; //float for calculating the weekly average temperature
		String userInput; //String for holding userInput
		int currIndex; //Current Index, int for holding the index in days of user input
		
		//Use custom method for updating daily temperatures
		updateTempsForWeek(dailyTemp, -1.46, 13.63, 41.0, 33.65, 16.67, 26.67, 43.12);
		
		//Add days of the week to days
		days.add("MONDAY");
		days.add("TUESDAY");
		days.add("WEDNESDAY");
		days.add("THURSDAY");
		days.add("FRIDAY");
		days.add("SATURDAY");
		days.add("SUNDAY");
		
		//Add daily temps together using foreach loop. 
		for(double temp : dailyTemp) {
			
			weeklyAvg += temp;
			
		}
		
		//Get average temp for the week by dividing the sum of daily temperatures by 7
		weeklyAvg = weeklyAvg / 7;
		
		//Create Scanner
		Scanner scnr = new Scanner(System.in);
		
		
		//Prompt user to enter a command recognized by the program. Next lines are used to improve readability in terminal
		System.out.println("Enter a day of the week to view the average temperature.\nOr enter 'week' to see "
		+ "the average for each day and the \naverage for the week. \nEnter 'exit' to close the program");
		
		
		//Get user input, trim whitespace, and make it upper case to match the days ArrayList.
		userInput = scnr.nextLine();
		userInput = userInput.trim();
		userInput = userInput.toUpperCase();
		
		//Keep program running until user chooses to exit
		while(!userInput.equals("EXIT")) {
			
			//Get index of the entered day
			currIndex = days.indexOf(userInput);
			
			/*Check if the index in days of userInput is equal to -1 AND not "week" or "exit". 
			 *Any valid input other than 'week' or 'exit' should have a non-negative index
			 *If the loop condition is met, inform the user of invalid input and prompt for new input
			 *Then process input in the same fashion as above
			 */
			while(currIndex == -1 && (!(userInput.equalsIgnoreCase("week") || userInput.equalsIgnoreCase("exit")))) {
				
				System.out.println(userInput + " is not a valid entry. Please try again.");
				userInput = scnr.nextLine();
				userInput = userInput.trim();
				userInput = userInput.toUpperCase();
				currIndex = days.indexOf(userInput);
				
			}
			
			//Print data for user if day of the week requested
			if(currIndex != -1) {
				
				System.out.println(days.get(currIndex) + " Average Temperature: " + dailyTemp.get(currIndex));
				
			}
			
			//Print data for user if week requested
			else {
				
				for(int i = 0; i < days.size(); i++) {
					
					System.out.println(days.get(i) + " Average Temperature: " + dailyTemp.get(i));
					
				}
				
				System.out.printf("Average Temperature for the Week: %.2f\n", weeklyAvg);
				
			}
			
			//next iteration
			userInput = scnr.nextLine();
			userInput = userInput.trim();
			userInput = userInput.toUpperCase();
			
		}
		
		//close Scanner
		scnr.close();
		
		//Terminate Program
		return;

	}
	
	//custom method for adding daily temperatures to an ArrayList. This method improves readability in the main method.z
	public static void updateTempsForWeek(ArrayList<Double> array, double mon, double tue, double wed, double thurs, double fri, 
			double sat, double sun) {
		array.add(mon);
		array.add(tue);
		array.add(wed);
		array.add(thurs);
		array.add(fri);
		array.add(sat);
		array.add(sun);
	}
	

}
