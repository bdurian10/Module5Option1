package module5Option1;

import java.util.ArrayList;
import java.util.Scanner;

public class Temps {
	
	public static void main(String[] args) {
		
		//Declare Variables
		ArrayList<Double> dailyTemp = new ArrayList<Double>();
		ArrayList<String> days = new ArrayList<String>();
		double weeklyAvg = 0;
		String userInput;
		int currIndex;
		
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
		
		//Get average temp for the week
		weeklyAvg = weeklyAvg / 7;
		
		//Create Scanner
		Scanner scnr = new Scanner(System.in);
		
		//Prompt User
		System.out.println("Enter a day of the week to view the average temperature.\n Or enter 'week' to see the all days\n and the average for the week");
		
		//Test
		for(double temp : dailyTemp) {System.out.println(temp);}
		for(String day : days) {System.out.println(day);}
	}

}
