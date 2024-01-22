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
		
		//Add daily temps to dailyTemp from Monday 15JAN24 to Sunday 21JAN24
		dailyTemp.add(-1.46);
		dailyTemp.add(13.63);
		dailyTemp.add(41.0);
		dailyTemp.add(33.65);
		dailyTemp.add(16.67);
		dailyTemp.add(26.67);
		dailyTemp.add(43.12);
		
		//Add days of the week to days
		days.add("MONDAY");
		days.add("TUESDAY");
		days.add("WEDNESDAY");
		days.add("THURSDAY");
		days.add("FRIDAY");
		days.add("SATURDAY");
		days.add("SUNDAY");
		
		//Add daily temps together
		for(double temp : dailyTemp) {
			
			weeklyAvg += temp;
		}
		
		//Get average temp for the week by dividing the sum of daily temperatures by 7
		weeklyAvg = weeklyAvg / 7;
		
		//Create Scanner
		Scanner scnr = new Scanner(System.in);
		
		
		//Prompt User
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
			
			//Handle bad inputs. Any input other than 'week' or 'exit' should have a non-negative index. 
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
			
			
			//Test ArrayLists
			//for(double temp : dailyTemp) {System.out.println(temp);}
			//for(String day : days) {System.out.println(day);}
		}
		//close Scanner
		scnr.close();
		
		//Terminate Program
		return;

	}

}
