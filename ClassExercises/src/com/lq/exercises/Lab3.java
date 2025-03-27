package com.lq.exercises;

public class Lab3 {

	public static void main(String[] args) {
		
		// EXERCICE 01
		
		String[] daysOfWeek = { "1-Sunday", "2-Monday", "3-Tuesday", "4-Wednesday", "5-Thursday", "6-Friday", "7-Saturday" };
		
		
		System.out.println();
		
		for(int i = 0; i < daysOfWeek.length; i++) {
			System.out.println(daysOfWeek[i]);
		}
		
		
		System.out.println();
		
		for(String day : daysOfWeek) {
			System.out.println(day);
		}
		
		
		System.out.println();
		
		for(int j = (daysOfWeek.length - 1); j >= 0; j--) {
			System.out.println(daysOfWeek[j]);
		}
		
		
		// EXERCISE 02
		
		System.out.println();
		
		int cont = 0;
		
		while(++cont <= 20) {
			
			if (cont % 2 == 0) {
				System.out.println(cont);
			}
			else
				continue;
			
		}
		
		
		// EXERCISE 03
		
		System.out.println();
		
		int number = 0;
		
		for (int i = 0; i < 100; i++) {
			
			number++;
			
			if (number >= 50 && number <= 60) {
				continue;
			}
			
			System.out.print(" " + number + " ");
		}
		
		
		// EXERCISE 04
		
		System.out.println();
		System.out.println();
		
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		
		int counter = 1;
		
		while (counter <= 12) {
			
			switch(counter) {
			
				case 1:
					System.out.println("Days of " + monthNames[counter-1] + ": " + 31);
					break;
				case 2:
					System.out.println("");
					break;
				case 3:
					System.out.println("Days of " + monthNames[counter-1] + ": " + 31);
					break;
				case 4:
					System.out.println("");
					break;
				case 5:
					System.out.println("Days of " + monthNames[counter-1] + ": " + 31);
					break;
				case 6:
					System.out.println("");
					break;
				case 7:
					System.out.println("Days of " + monthNames[counter-1] + ": " + 31);
					break;
				case 8:
					System.out.println("Days of " + monthNames[counter-1] + ": " + 31);
					break;
				case 9:
					System.out.println("");
					break;
				case 10:
					System.out.println("Days of " + monthNames[counter-1] + ": " + 31);
					break;
				case 11:
					System.out.println("");
					break;
				case 12:
					System.out.println("Days of " + monthNames[counter-1] + ": " + 31);
					break;
				default:
					System.out.println("Not supported");
					break;
			}
			
			counter++;
		}
		
		
		// CHALLENGE EXERCISE
		
		System.out.println();
		
		String[] daysOfWeekThin = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		
		final byte MAX_INDEX_DAY_OF_WEEK = 7;
		final byte START_INDEX_DAY_OF_WEEK = 6;
		final byte FIRST_DAY_OF_MONTH = 1;
		final byte LAST_DAY_OF_MONTH = 31;
		
		for (String dayOfWeek : daysOfWeekThin) {
			System.out.print(dayOfWeek + "\t");
		}
		
		System.out.println();
		
		int currentIndexDayOfWeek = 0;
		byte currentDayOfMonth = 0;
		boolean released = false;
		
		while(true) {
			
			currentIndexDayOfWeek++;
			
			if (!released) {
				if(currentIndexDayOfWeek < START_INDEX_DAY_OF_WEEK) {
					System.out.print("\t");
					continue;
				}
				else {
					released = true;
					currentDayOfMonth = FIRST_DAY_OF_MONTH;
				}
			}
			
			System.out.print(currentDayOfMonth + "\t");
			
			currentDayOfMonth++;
			
			if(currentIndexDayOfWeek == MAX_INDEX_DAY_OF_WEEK) {
				System.out.println();
				currentIndexDayOfWeek = 0;
			}
			
			if(currentDayOfMonth > LAST_DAY_OF_MONTH)
				break;
		}
		
	}

}
